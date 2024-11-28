package ruahma.renan.ecommerceapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ruahma.renan.ecommerceapplication.entity.Cart;
import ruahma.renan.ecommerceapplication.service.CartService;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> listarItens(){
        return cartService.listarItens();
    }

    @PostMapping
     public Cart adicionarProduto(@RequestBody Cart cart) {
        return cartService.adicionarProduto(cart);
    
     }

    @DeleteMapping
    public void removerProduto(@PathVariable Long id) {
        cartService.removerProduto(id);
    }
     
    
}