package Projec.Model;

import java.util.ArrayList;

public class Produtor extends User{

    private Enum cargo;

    public Enum getCargo(){
        return cargo;
    }

    public void iniciaProduto(ArrayList<Produto> produtos){

    }

    public void finalizaProduto(ArrayList<Produto> produtos){

    }
    
    public Produtor(String nom, String ema, String tele, Integer ID, Double sal){
        super(nom, ema, tele, ID, sal);
        this.cargo = Cargos.ESTOQUISTA;
    }
}
