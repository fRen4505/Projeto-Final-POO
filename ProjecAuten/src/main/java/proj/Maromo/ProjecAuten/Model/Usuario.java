package proj.Maromo.ProjecAuten.Model;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idUsuario;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @CreationTimestamp
    private Instant cadastroHora;

    @UpdateTimestamp
    private Instant altUpdCadasInfo;

    //get de id
    public UUID getIdUser() {
        return idUsuario;
    }

    //get set de email
    public String getEmail() {
        return email;
    }
    public void setEmail(String ins) {
        this.email = ins;
    }

    //get set de nome
    public String getNome() {
        return nome;
    }
    public void setNome(String ins) {
        this.nome = ins;
    }

    //get set de senha
    public String getSenha() {
        return senha;
    }
    public void setSenha(String ins) {
        this.senha = ins;
    }

    public Instant getCadas(){
        return cadastroHora;
    }

    //get set de tempo de cadastro
    public Instant getUpdatCadas(){
        return altUpdCadasInfo;
    }
    public void setUpdatCadas(Instant updt){
        this.altUpdCadasInfo = updt;
    }
    

    //construtor
    public Usuario(String nom, String emai, String pass){
        this.idUsuario = UUID.randomUUID();
        this.cadastroHora = Instant.now();
        this.email = emai;
        this.nome = nom;
        this.senha = pass;
    }

}
