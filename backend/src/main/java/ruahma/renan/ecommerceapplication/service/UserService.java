/*
 * O controlador deve ser apenas uma interface para o cliente 
 * e não deve conter lógica de negócio. Toda lógica vai para 
 * uma classe de serviço (ex.: UsuarioService).
*/

package ruahma.renan.ecommerceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ruahma.renan.ecommerceapplication.entity.User;
import org.springframework.stereotype.Service;

import ruahma.renan.ecommerceapplication.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository usuarioRepository;

    public List<User> listarTodos() {
        return usuarioRepository.findAll();
    }

    public User buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public User salvarUsuario(User usuario) {
        return usuarioRepository.save(usuario);
    }

    public User atualizarUsuario(Long id, User usuario) {
        User existente = buscarPorId(id);
        existente.setName(usuario.getName());
        existente.setEmail(usuario.getEmail());
        // Atualize outros campos aqui
        return usuarioRepository.save(existente);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}

