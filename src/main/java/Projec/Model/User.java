package Projec.Model;

public class User {
    private String nome;
    private Integer ID;
    private String telefone;
    private String email;
    //private Enum cargo;
    private Double salario;

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getTele(){
        return telefone;
    }

    public Integer getID(){
        return ID;
    }
    public Double getDoub(){
        return salario;
    }

    //public Enum getCargo(){
    //    return cargo;
    //}
    
    public User(String nom, String emai, String tele, Integer nID, Double sal){
        this.nome = nom;
        this.email = emai;
        this.telefone = tele;
        this.ID = nID;
        this.salario = sal;
    }
}
