package ruahma.renan.ecommerceapplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ruahma.renan.ecommerceapplication.entity.Pedido;
import ruahma.renan.ecommerceapplication.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class OrderController {

    @Autowired
    private PedidoService orderService;

    // Lista todos os pedidos
    @GetMapping
    public List<Pedido> listarTodos() {
        return orderService.listarTodos();
    }

    // Busca um pedido por ID
    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return orderService.buscarPorId(id);
    }

    // Cria um novo pedido
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido order) {
        return orderService.salvarPedido(order);
    }

    // Atualiza um pedido
    @PutMapping("/{id}")
    public Pedido atualizarPedido(@PathVariable Long id, @RequestBody Pedido order) {
        return orderService.atualizarPedido(id, order);
    }

    // Deleta um pedido
    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id) {
        orderService.deletarPedido(id);
    }
}
