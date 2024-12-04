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

import proj.Maromo.ProjecAuten.Model.Items;

import proj.Maromo.ProjecAuten.Service.itemServ;

@RestController
@RequestMapping("/Item {IDitem}")
public class controItem {
    
    private itemServ service;

    public controItem(itemServ servIns){
        this.service = servIns;
    }

    @PostMapping
    public ResponseEntity<Items> criarItem(@RequestBody criarItemDTO cadastro){
        var cadInfo = service.criarItem(cadastro);

        return ResponseEntity.created(URI.create("INSERIR LOCAL DO BANCO" + cadInfo.toString())).build();
    }

    @GetMapping("/{IDitem}")
    public ResponseEntity<Items> pegarItemPorID(@PathVariable("IDitem") String usID){
        
        var itInfo = service.getItemPID(usID);

        if (itInfo.isPresent()) {
            return ResponseEntity.ok(itInfo.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Items>> listarItems(){
        var itList = service.getItemsList();

        return ResponseEntity.ok(itList);
    }

    @PutMapping("/{IDitem}")
    public ResponseEntity<Void> alterarItemInfoPorID(@PathVariable("IDitem") String itID, @RequestBody alterItemDTO alterar){
        service.alterItemInfoPID(itID, alterar);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{IDitem}")
    public ResponseEntity<Void> deletarItemPorID(@PathVariable("IDitem") String itID){
        service.deleteItemPID(itID);
        return ResponseEntity.noContent().build();
    }


}
