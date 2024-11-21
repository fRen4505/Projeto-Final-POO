package Projec.Model;

import java.util.Random;

public class Item {
    private String Nome;
    private String Marca;
    private Integer ID;
    private Integer Quantidade = 0;
    private Tipos tipo;
    private String Descricao;
    private String Proporcoes;

    public String getNome(){
        return Nome;
    }
    public Integer getID(){
        return ID;
    }
    public Integer getQuant(){
        return Quantidade;
    }

    public void setPropor(String prop){
        this.Proporcoes = prop;
    }

    public void addQntd(Integer nQntd){
        this.Quantidade = Quantidade + nQntd;
    }
    public void subQntd(Integer nQntd){
        if ( (Quantidade - nQntd) < 0) {
            this.Quantidade = 0;
        } else {
            this.Quantidade = Quantidade - nQntd;
        }
    }

    public String getItemInfo(){
        return "Nome: "+Nome+ "\tMarca: "+Marca+"\tID: "+ID+"\tTipo: "+tipo.getNom()+
        "\nDescrição: \t"+Descricao+"\tProporções: "+Proporcoes+"\nQuantidade: "+Quantidade+"\n";
    }

    public Item(String nom, String marc, String descri, Tipos func){
        Random rand = new Random();
        Integer iden = rand.nextInt(10, 1000);

        this.Nome = nom;
        this.Marca = marc;
        this.Descricao = descri;
        this.tipo = func;
        this.ID = iden;
    }
}
