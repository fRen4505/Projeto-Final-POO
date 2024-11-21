package Projec.Model;

import java.util.ArrayList;

public class MainModel {

    ArrayList<User> funcionarios = new ArrayList<>(); //se não tiver nenhum usuario sera aberto tela para criar um administrador do sistema
    ArrayList<Estoque> estoque = new ArrayList<>();
    ArrayList<Produto> producao = new ArrayList<>();
    ArrayList<Produto> espera = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("funcionou");
    }
}
