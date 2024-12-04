package proj.Maromo.ProjecAuten.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.var;
import org.springframework.stereotype.Service;

import proj.Maromo.ProjecAuten.Controller.alterItemDTO;
import proj.Maromo.ProjecAuten.Controller.criarItemDTO;
import proj.Maromo.ProjecAuten.Model.Items;
import proj.Maromo.ProjecAuten.Repository.itemRepos;

@Service
public class itemServ {
    
    private itemRepos repos;

    public itemServ(itemRepos reposIns){
        this.repos = reposIns;
    }

    public UUID criarItem(criarItemDTO cadastro){

        var itIDsaved = repos.save(new Items(cadastro.nome(), cadastro.descricao(), cadastro.quantidade()));

        return itIDsaved.getIDItem();
    }

    public Optional<Items> getItemPID(String IDins){
        return repos.findById(UUID.fromString(IDins));
    }

    public List<Items> getItemsList(){
        return repos.findAll();
    }

    public void alterItemInfoPID(String IDins, alterItemDTO alter){

        var confID = UUID.fromString(IDins);

        var itemExist = repos.findById(confID);

        if (itemExist.isPresent()) {
            var itemAlt = itemExist.get();

            if (alter.nome() != null) {
                itemAlt.setNome(alter.nome());
            }
            if (alter.descricao() != null) {
                itemAlt.setDescri(alter.descricao());
            }
            if (alter.quantidade() != null) {
                itemAlt.setQtnd(alter.quantidade());
            }

            repos.save(itemAlt);
        }
    }

    public void deleteItemPID(String IDins){
        var confID = UUID.fromString(IDins);

        var itemExist = repos.existsById(confID);

        if (itemExist) {
            repos.deleteById(confID);
        }
    } 

}
