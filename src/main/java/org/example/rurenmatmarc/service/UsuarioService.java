package org.example.rurenmatmarc.service;

import java.util.List;

import org.example.rurenmatmarc.model.Usuario;
import org.example.rurenmatmarc.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    // Dependência do repositório para interagir com a camada de persistência.
    private final UserRepository userRepository;

    
    public UsuarioService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
    public List<Usuario> listarTodos() {
        return userRepository.findAll();
    }

   
    public Usuario salvar(Usuario usuario) {
        return userRepository.save(usuario);
    }

    
    public Usuario buscarPorId(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Usuario não encontrado com ID: " + id));
    }

    
    public void deletar(Long id) {
        userRepository.deleteById(id);
    }
}