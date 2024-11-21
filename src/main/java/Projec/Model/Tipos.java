package Projec.Model;

public enum Tipos {
    ALIMENTICIO("Alimenticio"), MATERIAL_ORGANICO("Material organico"), MATERIAL_METALICO("Material metalico"), MATERIAL_PLASTICO("Material plastico"), PECA("Peça"), FERRAMENTA("Ferramenta");

    String nom;

    public String getNom(){
        return nom;
    }

    Tipos(String info){
        this.nom = info;
    }

}
