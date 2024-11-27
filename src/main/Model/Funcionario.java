package Projec.Model;

public class Funcionario extends Usuario {
    private String cargo;
    private String setor;

    //get cargo
    public String getCargo(){
        return cargo;
    }
    
    //get setor
    public String getSetor(){
        return setor;
    }
    
    //construtor
    public Funcionario(Integer id, String nom, String emai, String cargoIns, String setorIns){
        super(id, nom, emai);
        this.cargo = cargoIns;
        this.setor = setorIns;
    }

}
