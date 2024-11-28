package ruahma.renan.ecommerceapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ruahma.renan.ecommerceapplication.entity.Cart;


public interface CartRepository extends JpaRepository<Cart,Long> {

    
} 