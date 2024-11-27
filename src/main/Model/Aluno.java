package Projec.Model;

public class Aluno extends Usuario {
    private String matricula;
    private String curso;

    //get de curso
    public String GetCurso() {
        return curso;
    }

    //get de matricula
    public String GetMatri() {
        return matricula;
    }

    //construtor
    public Aluno(Integer id, String nom, String emai, String matri, String cur){
        super(id, nom, emai);
        this.matricula = matri;
        this.curso = cur;
    }
}
