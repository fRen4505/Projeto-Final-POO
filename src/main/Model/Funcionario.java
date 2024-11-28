package Projec.Model;

import java.util.ArrayList;

public class Funcionario extends Usuario {
    private String cargo;
    private ArrayList<Items> itemAvenda;

    //get cargo
    public String getCargo(){
        return cargo;
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
    public Funcionario(Integer id, String nom, String emai, String pass,  String cargoIns){
        super(id, nom, emai, pass);
        this.cargo = cargoIns;
    }

}
