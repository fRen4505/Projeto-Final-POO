package proj.Maromo.ProjecAuten.Model;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID IDitem;

    @Column(name = "it_nome")
    private String nome;

    @Column(name = "it_email")
    private String descricao;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "disponibilidade")
    private Boolean disponivel;

    @CreationTimestamp
    private Instant cadastroItemHora;

    @UpdateTimestamp
    private Instant altItemUpdInfo;

    //get de id
    public UUID getIDItem() {
        return IDitem;
    }

    //get set de titulo
    public String getNome() {
        return nome;
    }
    public void setNome(String ins){
        this.nome = ins;
    }

    //get set de descrição
    public String getDescri() {
        return descricao;
    }
    public void setDescri(String ins){
        this.descricao = ins;
    }

    //get set de disponivel
    private void setDisponibilidade(){
        if (quantidade >= 1) {
            this.disponivel = true;
        } else {
            this.disponivel = false;
        }
    }
    public boolean getDispo(){
        return disponivel;
    }

    //get set de quantidade
    public Integer getQtnd(){
        return quantidade;
    }
    public void setQtnd(int qntdIns){
        this.quantidade = qntdIns;
    }

    public Instant getItemCadas(){
        return cadastroItemHora;
    }

    public Instant getUpdatItem(){
        return altItemUpdInfo;
    }
    public void setUpdatItem(Instant updt){
        this.altItemUpdInfo = updt;
    }
    

    //construtor
    public Items(String nomeIns, String descriIns, Integer qntd){
        this.IDitem = UUID.randomUUID();
        this.cadastroItemHora = Instant.now();
        this.nome = nomeIns;
        this.descricao = descriIns;
        this.quantidade = qntd;
        setDisponibilidade();
    }

}
