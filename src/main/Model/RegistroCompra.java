package Projec.Model;

import java.time.LocalDate;

public class RegistroCompra {
    private Integer idCompra;
    private Usuario usuario; 
    private Items item; 
    private LocalDate dataCompra;
    
    //get ID compra
    public Integer getIdCompra(){
        return idCompra;
    }

    //get set usuario
    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(int IDuser, String nome, String email, String pass){
        this.usuario = new Usuario(IDuser, nome, email, pass);
    }

    //get set livro
    public Items getItem(){
        return item;
    }
    public void setItem(int ID, String nome, String descri, int qtnd){
        this.item = new Items(ID, nome, descri, qtnd);
    }

    //get set dataEmprestimo
    public LocalDate getDataCompra(){
        return dataCompra;
    }
    public void setDataCompra(LocalDate data){
        this.dataCompra = data;
    }

    //construtor
    public RegistroCompra(int ID, Usuario user, Items it, LocalDate data){
        this.idCompra = ID;
        this.usuario = user;
        this.item = it;
        this.dataCompra = data;
    }

}
