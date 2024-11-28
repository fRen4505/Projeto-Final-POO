package ruahma.renan.ecommerceapplication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    private Integer quantidade;
    private Double precoUnitario;

    public Double getSubtotal() {
        return precoUnitario * quantidade;
    }
}
