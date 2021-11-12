package br.com.api.resource;

import br.com.api.model.Produto;
import br.com.api.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
