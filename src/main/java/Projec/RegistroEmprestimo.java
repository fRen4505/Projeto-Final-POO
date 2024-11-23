package Projec;

import Projec.Model.*;

import java.time.LocalDate;

public class RegistroEmprestimo {
    private Integer idEmprestimo;
    private Usuario usuario; //= new Usuario(0, "", "");
    private Livro livro; //= new Livro(0, "", "");
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    
    //get ID emprestimo
    public Integer getIdEmprestimo(){
        return idEmprestimo;
    }

    //get set usuario
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(int IDuser, String nome, String email){
        this.usuario = new Usuario(idEmprestimo, nome, email);
    }

    //get set livro
    public Livro getLivro(){
        return livro;
    }
    public void setLivro(int ID, String titulo, String autor){
        this.livro = new Livro(ID, titulo, autor);
    }

    //get set dataEmprestimo
    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }
    public void setDataEmprestimo(LocalDate data){
        this.dataEmprestimo = data;
    }

    //get set dataDevolução
    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }
    public void setDataDevoulucao(LocalDate data){
        this.dataDevolucao = data;
    }

    //construtor
    public RegistroEmprestimo(int ID, Usuario user, Livro livro, LocalDate dataempres, LocalDate datadevo){
        this.idEmprestimo = ID;
        this.usuario = user;
        this.livro = livro;
        this.dataEmprestimo = dataempres;
        this.dataDevolucao = datadevo;
    }

}
