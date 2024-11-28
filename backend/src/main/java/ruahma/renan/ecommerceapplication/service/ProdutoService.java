package ruahma.renan.ecommerceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ruahma.renan.ecommerceapplication.entity.Produto;
import ruahma.renan.ecommerceapplication.repository.ProdutoRepository;

public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    // Método para listar todos os produtos
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    // Método para buscar um produto por ID
    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    // Método para salvar um novo produto
    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    // Método para deletar um produto
    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
