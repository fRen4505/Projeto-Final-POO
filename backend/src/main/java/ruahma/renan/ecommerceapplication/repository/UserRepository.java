/*
 * É um repositório JPA, usado para manipular a tabela do usuário no banco de dados.
 * 
*/

package ruahma.renan.ecommerceapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ruahma.renan.ecommerceapplication.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);

    
} 