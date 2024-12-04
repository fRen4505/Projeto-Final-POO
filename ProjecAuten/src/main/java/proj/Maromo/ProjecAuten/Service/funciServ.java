package proj.Maromo.ProjecAuten.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.var;
import org.springframework.stereotype.Service;

import proj.Maromo.ProjecAuten.Controller.alterFuncioDTO;
import proj.Maromo.ProjecAuten.Controller.criarFuncioDTO;
import proj.Maromo.ProjecAuten.Model.Funcionario;
import proj.Maromo.ProjecAuten.Repository.funcRepos;

@Service
public class funciServ {
    
    private funcRepos repos;

    public funciServ(funcRepos reposIns){
        this.repos = reposIns;
    }

    public UUID criarFuncionario(criarFuncioDTO cadastro){

        var fuIDsaved = repos.save(new Funcionario(cadastro.name(), cadastro.email(), cadastro.pass(), cadastro.cargo()));

        return fuIDsaved.getIdUser();
    }

    public Optional<Funcionario> getFuncioPID(String IDins){
        return repos.findById(UUID.fromString(IDins));
    }

    public List<Funcionario> getFuncioList(){
        return repos.findAll();
    }

    public void altFuncioPID(String IDins, alterFuncioDTO alter){

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
            if (alter.cargo() != null) {
                userAlt.setCargo(alter.cargo());
            }

            repos.save(userAlt);
        }
    }

    public void deleteFuncioPID(String IDins){
        var confID = UUID.fromString(IDins);

        var userExist = repos.existsById(confID);

        if (userExist) {
            repos.deleteById(confID);
        }
    }

}
