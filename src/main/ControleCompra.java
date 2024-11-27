package Projec;

import Projec.Model.*;
import Projec.View.*;

import java.time.LocalDate;
import java.util.Random;


public class ControleCompra {

    private RegistroCompra registro;    

    public void registrarCompra(Usuario user, Items item){
        Random rand = new Random();

        Integer ID = rand.nextInt(700, 3500);
        LocalDate dataEmp = LocalDate.now();
        
        registro = new RegistroCompra(ID, user, item, dataEmp);
        
        item.setDisponibilidade();

        System.out.println("======================================================================================");
        System.out.println("ID: "+registro.getIdCompra() + "\nItem: " + registro.getItem().getNome() +"\tComprado por:"+ registro.getUsuario().getNome() +"\n Na data: "+ registro.getDataCompra());
        System.out.println("======================================================================================");

    }

    /*
    public void registrarDevolucao(Usuario user, Livro livro){

        LocalDate dataAtual = LocalDate.now();

        livro.setDisponibilidade();
        System.out.println("======================================================================================");
        System.out.println( registro.getIdEmprestimo() + "\nLivro: " + registro.getLivro().getTitulo() +"\t Emprestado para: "+ registro.getUsuario().getNome() +"\nNa data: "+ registro.getDataEmprestimo());
        System.out.println("Sendo a data para devolver: "+registro.getDataDevolucao()+"\nFoi devolvido na data de: "+ dataAtual);
        System.out.println("======================================================================================");

    }
    */

    public ControleCompra(){

    }

}
