package proj.Maromo.ProjecAuten.Model;

import java.util.ArrayList;

public class Funcionario extends Usuario {
    private String cargo;
    private ArrayList<Items> itemAvenda;

    //get set cargo
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String ins){
        this.cargo = ins;
    }
    
    //get set de lista de carrinho
    public void setItemVenda(Items item){
        this.itemAvenda.add(item);
    }
    public ArrayList<Items> getItemVenda(){
        return itemAvenda;
    }
    public Items getItem(Integer i){
        return itemAvenda.get(i);
    }


    
    //construtor
    public Funcionario(String nom, String emai, String pass,  String cargoIns){
        super(nom, emai, pass);
        this.cargo = cargoIns;
    }

}
