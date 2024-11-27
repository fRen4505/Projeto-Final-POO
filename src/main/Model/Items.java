package Projec.Model;

public class Items {
    private Integer IDitem;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private Boolean disponivel;

    //get de id
    public Integer getIDItem() {
        return IDitem;
    }

    //get de titulo
    public String getNome() {
        return nome;
    }

    //get de autor
    public String getDescri() {
        return descricao;
    }

    //get set de disponivel
    public void setDisponibilidade(){
        if (quantidade >= 1) {
            this.disponivel = true;
        } else {
            this.disponivel = false;
        }
    }
    public boolean getDispo(){
        return disponivel;
    }

    //get de quantidade
    public Integer getQtnd(){
        return quantidade;
    }

    //construtor
    public Items(int idIns, String nomeIns, String descriIns, Integer qntd){
        this.IDitem = idIns;
        this.nome = nomeIns;
        this.descricao = descriIns;
        this.quantidade = qntd;
    }

}
