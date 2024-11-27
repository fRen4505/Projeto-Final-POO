package Projec.Model;

import java.util.ArrayList;

public class Usuario {

    private Integer idUsuario;
    private String nome;
    private String email;
    private ArrayList<Items> comprados = new ArrayList<Items>();

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
    public void setComprados(Items livro){
        this.comprados.add(livro);
    }
    public ArrayList<Items> getComprados(){
        return comprados;
    }
    public Items getLivro(Integer i){
        return comprados.get(i);
    }

    //construtor
    public Usuario(Integer id, String nom, String emai){
        this.email = emai;
        this.nome = nom;
        this.idUsuario = id;
    }

}
