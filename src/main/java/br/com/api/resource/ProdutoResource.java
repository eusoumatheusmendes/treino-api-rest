package br.com.api.resource;

import br.com.api.model.Produto;
import br.com.api.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @Autowired
    IProdutoRepository repository;

    @GetMapping("/lista")
    public List<Produto> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable("id") Long id){
        return repository.findById(id);
    }
    
    @PostMapping("/cadastrar")
    public Produto cadastrar(@RequestBody Produto produto){
        repository.save(produto);
        return produto;
    }
}
