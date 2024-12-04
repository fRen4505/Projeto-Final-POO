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

import proj.Maromo.ProjecAuten.Model.Funcionario;
import proj.Maromo.ProjecAuten.Service.funciServ;

@RestController
@RequestMapping("/User {idUsuario}")
public class controFuncio {
    
    private funciServ service;

    public controFuncio(funciServ servIns){
        this.service = servIns;
    }

    @PostMapping
    public ResponseEntity<Funcionario> criarUser(@RequestBody criarFuncioDTO cadastro){
        var cadInfo = service.criarFuncionario(cadastro);

        return ResponseEntity.created(URI.create("INSERIR LOCAL DO BANCO" + cadInfo.toString())).build();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Funcionario> pegarPorID(@PathVariable("idUsuario") String usID){
        
        var funInfo = service.getFuncioPID(usID);

        if (funInfo.isPresent()) {
            return ResponseEntity.ok(funInfo.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping
    public ResponseEntity<List<Funcionario>> listarFuncionarios(){
        var funList = service.getFuncioList();

        return ResponseEntity.ok(funList);
    }

    @PutMapping("/{idUsuario}")
    public ResponseEntity<Void> alterarFuncionarioInfo(@PathVariable("idUsuario") String usID, @RequestBody alterFuncioDTO alterar){
        service.altFuncioPID(usID, alterar);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<Void> deletarFuncionarioPorID(@PathVariable("idUsuario") String usID){
        service.deleteFuncioPID(usID);
        return ResponseEntity.noContent().build();
    }


}
