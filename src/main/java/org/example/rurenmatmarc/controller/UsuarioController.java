package org.example.rurenmatmarc.controller;

import java.util.List;


import org.example.rurenmatmarc.model.Usuario;
import org.example.rurenmatmarc.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService userService;

    public UsuarioController(UsuarioService userService) {
        this.userService = userService;
    }

   
    @GetMapping
    public List<Usuario> listarTodos() {
        return userService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
        if(usuario.getSenha()==null || usuario.getSenha().isBlank()){
            return ResponseEntity.badRequest().body(null);
        }
        Usuario usuarioSalvo = userService.salvar(usuario);
        return ResponseEntity.ok(usuarioSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
        Usuario usuario = userService.buscarPorId(id);
        return ResponseEntity.ok(usuario);
    }

   
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        Usuario usuarioExistente = userService.buscarPorId(id);
        if (usuarioExistente == null) {
            return ResponseEntity.notFound().build(); // Retorna 404 se o usuario não existir
        }
        usuarioExistente.setNome(usuarioAtualizado.getNome());
        usuarioExistente.setEmail(usuarioAtualizado.getEmail());
        usuarioExistente.setAtivo(usuarioAtualizado.getAtivo());


        Usuario usuarioSalvo = userService.salvar(usuarioExistente);
        return ResponseEntity.ok(usuarioSalvo);
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        userService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
