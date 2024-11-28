package ruahma.renan.ecommerceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ruahma.renan.ecommerceapplication.entity.Cart;
import ruahma.renan.ecommerceapplication.repository.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    // Lista os itens no carrinho
    public List<Cart> listarItens() {
        return cartRepository.findAll();
    }

    // Adiciona um produto ao carrinho
    public Cart adicionarProduto(Cart cart) {
        return cartRepository.save(cart);
    }

    // Remove um produto do carrinho
    public void removerProduto(Long id) {
        cartRepository.deleteById(id);
    }
}
