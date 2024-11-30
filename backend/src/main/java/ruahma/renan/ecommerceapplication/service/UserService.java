/*
 * O controlador deve ser apenas uma interface para o cliente 
 * e não deve conter lógica de negócio. Toda lógica vai para 
 * uma classe de serviço
*/

package ruahma.renan.ecommerceapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import ruahma.renan.ecommerceapplication.entity.User;
import org.springframework.stereotype.Service;

import ruahma.renan.ecommerceapplication.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

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
        
        return usuarioRepository.save(existente);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }
}

