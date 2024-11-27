package Projec.View;

import Projec.Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class CadastroUser extends JFrame implements ActionListener{

    private ArrayList<Usuario>users;
    private String userTipo;
    private Random rand = new Random();
    private TextField nome, email, matri, curso, cargo, setor;
    private JButton Aluno, Funci, Finalizar;
    

    public CadastroUser(ArrayList<Usuario>userList){
        users = userList;
        setSize(800, 600);
        setTitle("Cadastro de Usuario");
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);//centro da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Finalizar = new JButton("Finalizar");
        Finalizar.setSize(100, 30);
        Finalizar.setLocation(600, 455);
        Finalizar.setFocusable(false);
        Finalizar.addActionListener(this);

        nome = new TextField();
        nome.setSize(300, 30);
        nome.setLocation(500, 180);
        add(nome);

        email = new TextField();
        email.setSize(300, 30);
        email.setLocation(500, 240);
        add(email);

        Aluno = new JButton("Aluno");
        Aluno.setSize(90, 30);
        Aluno.setLocation(500, 300);
        Aluno.setFocusable(false);
        Aluno.addActionListener(this);
        add(Aluno);

        Funci = new JButton("Funcionario");
        Funci.setSize(100, 30);
        Funci.setLocation(600, 300);
        Funci.setFocusable(false);
        Funci.addActionListener(this);
        add(Funci);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Aluno) {
            userTipo = "aluno";

            Funci.setEnabled(false);

            matri = new TextField();
            matri.setSize(300, 30);
            matri.setLocation(500, 350);
            add(matri);

            curso = new TextField();
            curso.setSize(300, 30);
            curso.setLocation(500, 400);
            add(curso);

            add(Finalizar);
        }

        
        if (e.getSource() == Funci) {
            userTipo = "funcio";

            Aluno.setEnabled(false);

            cargo = new TextField();
            cargo.setSize(300, 30);
            cargo.setLocation(500, 350);
            add(cargo);

            setor = new TextField();
            setor.setSize(300, 30);
            setor.setLocation(500, 400);
            add(setor);

            add(Finalizar);
        }

        if (e.getSource() == Finalizar) {
            Integer ID = rand.nextInt();
            
            switch (userTipo) {
                case "aluno":
                    Aluno aluno = new Aluno(ID, nome.getText(), email.getText(), matri.getText(), curso.getText());

                    users.add(aluno);
                    
                    break;
               
                case "funcio":
                    
                    Funcionario funci = new Funcionario(ID, nome.getText(), email.getText(), cargo.getText(), setor.getText());
                    
                    users.add(funci);
                    
                    break;

                default:
                    break;
            }
            CadastroUser.super.dispose();
        }

    }
    
}
