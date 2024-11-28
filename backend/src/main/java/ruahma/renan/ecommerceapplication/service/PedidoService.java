package ruahma.renan.ecommerceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ruahma.renan.ecommerceapplication.entity.Produto;
import ruahma.renan.ecommerceapplication.repository.ProdutoRepository;

@Service
public class PedidoService {
    
    @Autowired
    private ProdutoRepository productRepository;

    // Lista todos os produtos
    public List<Produto> listarTodos() {
        return productRepository.findAll();
    }

    // Busca um produto pelo ID
    public Produto buscarPorId(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    // Cria um novo produto
    public Produto salvarProduto(Produto product) {
        return productRepository.save(product);
    }

    // Atualiza um produto
    public Produto atualizarProduto(Long id, Produto product) {
        Produto existente = buscarPorId(id);
        existente.setName(product.getName());
        existente.setPreco(product.getPreco());
        existente.setDescricao(product.getDescricao());
        return productRepository.save(existente);
    }

    // Deleta um produto
    public void deletarProduto(Long id) {
        productRepository.deleteById(id);
    }
}