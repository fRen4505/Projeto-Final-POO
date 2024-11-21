package Projec.Model;

public enum Cargos {
    ADMINISTRADOR("Administrador"), ESTOQUISTA("Estoquista"), PRODUTOR("Produtor");

    String funcao;

    Cargos(String func){
        this.funcao = func;
    }
}
