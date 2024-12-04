package proj.Maromo.ProjecAuten.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.var;
import org.springframework.stereotype.Service;

import proj.Maromo.ProjecAuten.Controller.alterClienDTO;
import proj.Maromo.ProjecAuten.Controller.criarClienDTO;
import proj.Maromo.ProjecAuten.Model.Cliente;
import proj.Maromo.ProjecAuten.Repository.clienRepos;

@Service
public class clienServ {
    
    private clienRepos repos;

    public clienServ(clienRepos reposIns){
        this.repos = reposIns;
    }

    public UUID criarCliente(criarClienDTO cadastro){
        
        var clIDsaved = repos.save(new Cliente(cadastro.name(), cadastro.email(), cadastro.pass()));
    
        return clIDsaved.getIdUser();
    }

    public Optional<Cliente> getClientePID(String IDins){
        return repos.findById(UUID.fromString(IDins));
    }

    public List<Cliente> getClienteList(){
        return repos.findAll();
    }

    public void altClienteInfoPID(String IDins, alterClienDTO alter){

        var confID = UUID.fromString(IDins);

        var userExist = repos.findById(confID);

        if (userExist.isPresent()) {
            var userAlt = userExist.get();

            if (alter.nome() != null) {
                userAlt.setNome(alter.nome());
            }
            if (alter.email() != null) {
                userAlt.setEmail(alter.email());
            }
            if (alter.pass() != null) {
                userAlt.setSenha(alter.pass());
            }

            repos.save(userAlt);
        }
    }

    public void deleteClientePID(String IDins){
        var confID = UUID.fromString(IDins);

        var userExist = repos.existsById(confID);

        if (userExist) {
            repos.deleteById(confID);
        }
    } 

}
