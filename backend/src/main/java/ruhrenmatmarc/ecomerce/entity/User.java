package ruhrenmatmarc.ecomerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity //Indica que essa classe é uma tabela no bd
@Table(name ="tb_users") // muda o nome da tabela no db
public class User {
    
    @Id //Chave primaria na tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera automaticamente o id
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false,name = "password")
    private String senha;

    @Column(nullable = false)
    private String name;

}
