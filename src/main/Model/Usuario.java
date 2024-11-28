package Projec.Model;


public class Usuario {

    private Integer idUsuario;
    private String nome;
    private String email;
    private String senha;

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

    public String getSenha() {
        return senha;
    }

    //construtor
    public Usuario(Integer id, String nom, String emai, String pass){
        this.email = emai;
        this.nome = nom;
        this.idUsuario = id;
        this.senha = pass;
    }

}
