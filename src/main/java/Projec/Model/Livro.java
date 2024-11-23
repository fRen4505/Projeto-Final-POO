package Projec.Model;

public class Livro {
    private Integer idlivro;
    private String titulo;
    private String autor;
    private Boolean disponivel;

    //get de id
    public Integer getIdLivro() {
        return idlivro;
    }

    //get de titulo
    public String getTitulo() {
        return titulo;
    }

    //get de autor
    public String getAutor() {
        return autor;
    }

    //get set de disponivel
    public void setDisponibilidade(int emp){
        //se ele for emprestado(1), definido pelo integer que recebe, ele retorna false pois ja foi emprestado
        if (emp == 1) {
            this.disponivel = false;
        } else {
            this.disponivel = true;
        }
    }
    public boolean getDispo(){
        return disponivel;
    }

    //construtor
    public Livro(int idIns, String tituloIns, String autorIns){
        this.idlivro = idIns;
        this.titulo = tituloIns;
        this.autor = autorIns;
    }

}
