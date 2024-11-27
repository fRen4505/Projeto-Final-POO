package Projec;

import Projec.Model.*;
import Projec.View.*;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GerenciarBiblioteca {

    public static void main(String[] args) {

        String opc;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Items> items = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ControleCompra emprestimo = new ControleCompra();

        do{
            System.out.println("\t ITEMS:");
            for (Items i : items) {
                System.out.print("\n =>Item: "+i.getNome() + "\t ID: "+i.getIDItem()+"\n -Disponivel: "+i.getDispo()+"\n");
            }

            
            System.out.println("\n \t USUARIOS:");
            for (Usuario u : usuarios) {
                System.out.print("\n =>Usuario: "+u.getNome()+" ID: "+u.getIdUser());
                for (int i = 0; i < u.getComprados().size(); i++) {
                    System.out.print("\n -Emprestados: "+u.getLivro(i).getNome());
                }
            }
            
            System.out.println("\n \t \t ==>OPCOES<==");
            System.out.println("\n C.cadastrar-se \t L.cadastrar Livro \t E.emprestar \t S.sair \n");
            opc = scan.nextLine();

            switch (opc) {
                case "c":
                    System.out.println("\t => CADASTRO DE USUARIO");
                    
                    CadastroUser cadUse = new CadastroUser(usuarios);
                    cadUse.setVisible(true);

                    break;

                case "l":
                    System.out.println("\t =>CADASTRO DE LIVROS");
                    
                    CadastroItem cadIt = new CadastroItem(items);
                    cadIt.setVisible(true);
                    
                    break;

                case "e":
                    System.out.println("\t =>EMPRESTAR E DEVOLUCAO DE LIVROS");
                     
                    Solicitar sol = new Solicitar(items);
                    sol.setVisible(true);

                    /* 
                    String user;
                    System.out.println("Digite seu usuario");
                    user = scan.nextLine();

                    String eopc;
                    System.out.println("Deseja \n E.emprestar livro \t D.devolver livro");
                    eopc = scan.nextLine();
                    switch (eopc) {
                        case "e":
                            for (Usuario us : usuarios) {
                                if (us.getNome().equals(user)) {
                                    String usLivro;
                                    System.out.println("Digite o nome do livro que procura");
                                    usLivro = scan.nextLine();
                                    for (Livro ls : livros) {
                                        if (ls.getTitulo().equals(usLivro)) {
                                            emprestimo.registrarEmprestimo(us, ls);
                                            us.setEmprestados(ls);
                                        } 
                                    }
                                    break;
                                }else{
                                    System.out.println("Usuario não achado");
                                }
                            }
                            break;
                        case "d": 
                            for (Usuario us : usuarios) {
                                if (us.getNome().equals(user)) {
                                    String usLivro;
                                    System.out.println("Digite o nome do livro que deseja devolver");
                                    usLivro = scan.nextLine();
                                    for (Livro ls : livros) {
                                        if (us.getEmprestados().contains(ls)) {
                                            emprestimo.registrarDevolucao(us, ls);
                                            us.getEmprestados().remove(ls);
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                    */
                default:
                    break;
            }

        } while(!opc.equals("s"));
        
        scan.close();
    }
}
