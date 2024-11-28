package ruahma.renan.ecommerceapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ruahma.renan.ecommerceapplication.entity.Produto;



public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
