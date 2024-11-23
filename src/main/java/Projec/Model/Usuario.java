package Projec.Model;

import java.util.ArrayList;

public class Usuario {

    private Integer idUsuario;
    private String nome;
    private String email;
    private ArrayList<Livro> emprestados = new ArrayList<Livro>();

    //get de id
    public Integer getIdUser() {
        return idUsuario;
    }

    //get de email
    public String getEmail() {
        return email;
    }

    //get de nome
    public String getNome() {
        return nome;
    }
    
    //get set de lista de emprestados
    public void setEmprestados(Livro livro){
        this.emprestados.add(livro);
    }
    public ArrayList<Livro> getEmprestados(){
        return emprestados;
    }
    public Livro getLivro(Integer i){
        return emprestados.get(i);
    }

    //construtor
    public Usuario(Integer id, String nom, String emai){
        this.email = emai;
        this.nome = nom;
        this.idUsuario = id;
    }

}
