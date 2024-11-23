package Projec;

import java.time.LocalDate;
import java.util.Random;

import Projec.Model.*;

public class ControleEmprestimo {

    private RegistroEmprestimo registro;    

    public void registrarEmprestimo(Usuario user, Livro livro){
        Random rand = new Random();

        Integer ID = rand.nextInt(700, 3500);
        LocalDate dataEmp = LocalDate.now();
        int year = Integer.valueOf(dataEmp.getYear());
        int day = Integer.valueOf(dataEmp.getDayOfYear());
        int daydev = day + 10;
        LocalDate dataDevo = LocalDate.ofYearDay(year, daydev);

        registro = new RegistroEmprestimo(ID, user, livro, dataEmp, dataDevo);
        
        livro.setDisponibilidade(1);

        System.out.println("======================================================================================");
        System.out.println("ID: "+registro.getIdEmprestimo() + "\nLivro: " + registro.getLivro().getTitulo() +" Emprestado para:"+ registro.getUsuario().getNome() +"\n Na data: "+ registro.getDataEmprestimo());
        System.out.println("Para ser devolvido na data: "+registro.getDataDevolucao());
        System.out.println("======================================================================================");

    }

    public void registrarDevolucao(Usuario user, Livro livro){

        LocalDate dataAtual = LocalDate.now();

        livro.setDisponibilidade(0);
        System.out.println("======================================================================================");
        System.out.println( registro.getIdEmprestimo() + "\nLivro: " + registro.getLivro().getTitulo() +"\t Emprestado para: "+ registro.getUsuario().getNome() +"\nNa data: "+ registro.getDataEmprestimo());
        System.out.println("Sendo a data para devolver: "+registro.getDataDevolucao()+"\nFoi devolvido na data de: "+ dataAtual);
        System.out.println("======================================================================================");

    }

    public ControleEmprestimo(){

    }

}
