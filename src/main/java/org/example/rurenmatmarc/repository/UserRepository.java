package org.example.rurenmatmarc.repository;


import org.example.rurenmatmarc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Usuario, Long> {
}