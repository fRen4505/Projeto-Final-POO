package Projec.Model;

public enum Inputs {
    
    ADICIONAR("adicionar"), ALTERAR("alterar"), EXCLUIR("excluir"), NOVOITEM("novo"), REMOVEITEM("remover");

    String nom;

    Inputs(String info){
        this.nom = info;
    }

}
