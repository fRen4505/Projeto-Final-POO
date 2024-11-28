package ruahma.renan.ecommerceapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ruahma.renan.ecommerceapplication.entity.Produto;
import ruahma.renan.ecommerceapplication.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService productService;

    @GetMapping
    public List<Produto> listarTodos(){
        return productService.listarTodos();
        
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id){
        return productService.buscarPorId(id);

    }

    @PostMapping
    public Produto criaProduto(@RequestBody Produto produto){
        return productService.salvarProduto(produto);
    }

    @PutMapping("/{id}")
    public void deletarProduto(@PathVariable  Long id){
        productService.deletarProduto(id);
    }
}
