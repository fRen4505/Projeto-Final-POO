package proj.Maromo.ProjecAuten.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proj.Maromo.ProjecAuten.Model.Cliente;
import proj.Maromo.ProjecAuten.Service.clienServ;

@RestController
@RequestMapping("/Cliente {idUsuario}")
public class controClien {
    
    private clienServ service;

    public controClien(clienServ servIns){
        this.service = servIns;
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody criarClienDTO cadastro){
        var cadInfo = service.criarCliente(cadastro);

        return ResponseEntity.created(URI.create("INSERIR LOCAL DO BANCO" + cadInfo.toString())).build();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Cliente> pegarClientePorID(@PathVariable("idUsuario") String usID){
        
        var clInfo = service.getClientePID(usID);

        if (clInfo.isPresent()) {
            return ResponseEntity.ok(clInfo.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarUsers(){
        var clList = service.getClienteList();

        return ResponseEntity.ok(clList);
    }

    @PutMapping("/{idUsuario}")
    public ResponseEntity<Void> altUserInfoPorID(@PathVariable("idUsuario") String usID, @RequestBody alterClienDTO alterar){
        service.altClienteInfoPID(usID, alterar);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<Void> deletarPorID(@PathVariable("idUsuario") String usID){
        service.deleteClientePID(usID);
        return ResponseEntity.noContent().build();
    }


}
