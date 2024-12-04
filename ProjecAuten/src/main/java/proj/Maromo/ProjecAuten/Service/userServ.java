package proj.Maromo.ProjecAuten.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.var;
import org.springframework.stereotype.Service;

import proj.Maromo.ProjecAuten.Controller.alterUserDTO;
import proj.Maromo.ProjecAuten.Controller.criarUserDTO;
import proj.Maromo.ProjecAuten.Model.Usuario;
import proj.Maromo.ProjecAuten.Repository.userRepos;

@Service
public class userServ {
    
    private userRepos repos;

    public userServ(userRepos reposIns){
        this.repos = reposIns;
    }

    public UUID criarUsuario(criarUserDTO cadastro){
        
        var usIDsaved = repos.save(new Usuario(cadastro.name(), cadastro.email(), cadastro.pass()));
    
        return usIDsaved.getIdUser();
    }

    public Optional<Usuario> getUserInfoPorID(String IDins){
        return repos.findById(UUID.fromString(IDins));
    }

    public List<Usuario> getUsersList(){
        return repos.findAll();
    }

    public void alterUserInfoporID(String IDins, alterUserDTO alter){

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

    public void deleteUserporID(String IDins){
        var confID = UUID.fromString(IDins);

        var userExist = repos.existsById(confID);

        if (userExist) {
            repos.deleteById(confID);
        }
    } 


}
