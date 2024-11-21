package Projec.Model;

import java.util.ArrayList;

public class Admin extends User{
    
    private Enum cargo;

    public Enum getCargo(){
        return cargo;
    }


    public void gerirEstoque(ArrayList<Estoque> inven, Enum acao){ //inserir todos os dados que serão usados para cadastro
        switch (acao) {
            case Inputs.ADICIONAR:
                
            
                break;
            
            case Inputs.NOVOITEM:


                break;

            case Inputs.REMOVEITEM:


                break;

            case Inputs.EXCLUIR:


                break;

            default:
                break;
        }
    }

    public void gerirProducao(ArrayList<Produto> produtos, Enum acao){
        switch (acao) {
            case Inputs.ADICIONAR:
                
            
                break;
            
            case Inputs.EXCLUIR:


                break;

            default:
                break;
        }
    }

    public void gerirFuncionario(ArrayList<User> funcionarios, Enum acao){
        switch (acao) {
            case Inputs.ADICIONAR:
                
            
                break;
            
            case Inputs.ALTERAR:


                break;

            case Inputs.EXCLUIR:


                break;

            default:
                break;
        }
    }
    
    
    public Admin(String nom, String ema, String tele, Integer ID, Double sal){
        super(nom, ema, tele, ID, sal);
        this.cargo = Cargos.ADMINISTRADOR;
    }
}
