package Projec.Model;

import java.util.ArrayList;

public class Estoque {
    
    private String estoqNome;
    private ArrayList<Item> materiais;

    public String getNome(){
        return estoqNome;
    }

    public Integer getEstoqueSize(){
        return materiais.size();
    }

    public Item getItem(int i){
        Item it = new Item(null, null, null, null);
        for (int j = 0; j < materiais.size() ; j++) {
            if (i == j) {
                it = materiais.get(j);
                break;
            }
        }
        return it;
    }
    public String getItemsInfos(Integer i){
        String it = "";
        for (int j = 0; j < materiais.size() ; j++) {
            if (i == j) {
                it = materiais.get(j).getItemInfo();
                break;
            }
        }
        return it;
    }

    public void addItem(Item novo){
        materiais.add(novo);
    }

    public Estoque(String nome){
        this.estoqNome = nome;
        this.materiais = new ArrayList<Item>();
    }

}
