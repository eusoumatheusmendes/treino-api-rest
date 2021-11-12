package br.com.api.resource;

import br.com.api.model.Produto;
import br.com.api.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoResource {

    @Autowired
    IProdutoRepository repository;

    @GetMapping("/produtos")
    public List<Produto> listar(){
        return repository.findAll();
    }
}
