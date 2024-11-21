package Projec.Model;

import java.util.ArrayList;

public class Estoquista extends User{

    private Enum cargo;

    public Enum getCargo(){
        return cargo;
    }

    public void novoLote(ArrayList<Estoque> estoque, String produNome){
        
    }

    public Estoquista(String nom, String ema, String tele, Integer ID, Double sal){
        super(nom, ema, tele, ID, sal);
        this.cargo = Cargos.ESTOQUISTA;
    }
}
