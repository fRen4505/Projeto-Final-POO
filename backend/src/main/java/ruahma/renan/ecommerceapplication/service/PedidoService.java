package ruahma.renan.ecommerceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ruahma.renan.ecommerceapplication.entity.Pedido;
import ruahma.renan.ecommerceapplication.repository.PedidoRepository;


@Service
public class PedidoService {
    
    
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido atualizarPedido(Long id, Pedido pedido) {
        Pedido existente = buscarPorId(id);
        // Atualiza os campos do pedido
        existente.setStatus(pedido.getStatus());
        existente.setItens(pedido.getItens());
        existente.setTotal(pedido.getTotal());

        return pedidoRepository.save(existente);
    }

    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
