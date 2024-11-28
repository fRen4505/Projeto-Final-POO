package ruahma.renan.ecommerceapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ruahma.renan.ecommerceapplication.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}
