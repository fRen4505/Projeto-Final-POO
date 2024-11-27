/*AS classes de controller servem para fazer as requisiçoõe
 * São responaveis por fazer a ligação entre front e back
*/
package ruahma.renan.ecommerceapplication.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ruahma.renan.ecommerceapplication.entity.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ruahma.renan.ecommerceapplication.service.UserService;

@RestController //Essa anotação indica que ela será um controlador e 
                // que os métodos retornam dados diretamente no corpo 
                //da resposta HTTP (em JSON, por exemplo).

@RequestMapping("/usuarios")
public class UserController {
    
@Autowired // Injeta automaticamente o serviço
    private UserService UserService;

    // GET /Users - Listar todos os usuários
    @GetMapping
    public List<User> listarTodos() {
        // Chama o serviço para buscar todos os usuários
        return UserService.listarTodos();
    }

    // GET /Users/{id} - Obter detalhes de um usuário específico
    @GetMapping("/{id}")
    public User buscarPorId(@PathVariable Long id) {
        // Chama o serviço para buscar um usuário pelo ID
        return UserService.buscarPorId(id);
    }

    // POST /usuarios - Registrar um novo usuário
    @PostMapping
    public User salvarUser(@RequestBody User usuario) {
        // Chama o serviço para salvar o usuário recebido no corpo da requisição
        return UserService.salvarUsuario(usuario);
    }

    // PUT /usuarios/{id} - Atualizar informações do usuário
    @PutMapping("/{id}")
    public User atualizarUsuario(@PathVariable Long id, @RequestBody User usuario) {
        // Chama o serviço para atualizar as informações do usuário
        return UserService.atualizarUsuario(id, usuario);
    }

    // DELETE /usuarios/{id} - Excluir um usuário
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        // Chama o serviço para deletar o usuário pelo ID
        UserService.deletarUsuario(id);
    }
}
