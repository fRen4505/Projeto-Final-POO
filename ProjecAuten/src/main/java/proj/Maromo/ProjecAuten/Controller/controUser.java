package proj.Maromo.ProjecAuten.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;


import proj.Maromo.ProjecAuten.Model.Usuario;
import proj.Maromo.ProjecAuten.Service.userServ;


@RestController
@RequestMapping("/User {idUsuario}")
public class controUser {
    
    private userServ service;

    public controUser(userServ servIns){
        this.service = servIns;
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUser(@RequestBody criarUserDTO cadastro){
        var cadInfo = service.criarUsuario(cadastro);

        return ResponseEntity.created(URI.create("INSERIR LOCAL DO BANCO" + cadInfo.toString())).build();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> pegarPorID(@PathVariable("idUsuario") String usID){
        
        var usInfo = service.getUserInfoPorID(usID);

        if (usInfo.isPresent()) {
            return ResponseEntity.ok(usInfo.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsers(){
        var usList = service.getUsersList();

        return ResponseEntity.ok(usList);
    }

    @PutMapping("/{idUsuario}")
    public ResponseEntity<Void> altUserInfoPorID(@PathVariable("idUsuario") String usID, @RequestBody alterUserDTO alterar){
        service.alterUserInfoporID(usID, alterar);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<Void> deletarPorID(@PathVariable("idUsuario") String usID){
        service.deleteUserporID(usID);
        return ResponseEntity.noContent().build();
    }

}
