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
    private TextField nome, email, cargo, senha;
    private JButton Cliente, Funci, Finalizar;
    

    public CadastroUser(ArrayList<Usuario>userList){
        users = userList;
        setSize(800, 600);
        setTitle("Cadastro de Usuario");
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);//centro da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //botao para finalizar cadastro
        Finalizar = new JButton("Finalizar");
        Finalizar.setSize(100, 30);
        Finalizar.setLocation(600, 555);
        Finalizar.setFocusable(false);
        Finalizar.addActionListener(this);

        //campo para colocar nome
        nome = new TextField();
        nome.setSize(300, 30);
        nome.setLocation(500, 180);
        add(nome);

        //campo para colocar email
        email = new TextField();
        email.setSize(300, 30);
        email.setLocation(500, 240);
        add(email);

        //campo para colocar senha
        senha = new TextField();
        senha.setSize(300, 30);
        senha.setLocation(500, 300);
        add(senha);

        //botao para selecionar tipo de usuario como cliente
        Cliente = new JButton("Cliente");
        Cliente.setSize(90, 30);
        Cliente.setLocation(500, 400);
        Cliente.setFocusable(false);
        Cliente.addActionListener(this);
        add(Cliente);

        //botao para selecionar tipo de usuario como vendedor
        Funci = new JButton("Funcionario");
        Funci.setSize(100, 30);
        Funci.setLocation(600, 400);
        Funci.setFocusable(false);
        Funci.addActionListener(this);
        add(Funci);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Cliente) {
            userTipo = "cliente";

            Funci.setEnabled(false);

            if (!senha.getText().isEmpty()) {
                add(Finalizar);
            }
        }

        
        if (e.getSource() == Funci) {
            userTipo = "funcio";

            Cliente.setEnabled(false);

            cargo = new TextField();
            cargo.setSize(300, 30);
            cargo.setLocation(500, 350);
            add(cargo);

            if (!senha.getText().isEmpty()) {
                add(Finalizar);
            }
        }

        if (e.getSource() == Finalizar) {
            Integer ID = rand.nextInt();
            
            switch (userTipo) {
                case "cliente":
                    Cliente cliente = new Cliente(ID, nome.getText(), email.getText(), senha.getText());

                    users.add(cliente);
                    
                    break;
               
                case "funcio":
                    
                    Funcionario funci = new Funcionario(ID, nome.getText(), email.getText(),senha.getText(), cargo.getText());
                    
                    users.add(funci);
                    
                    break;

                default:
                    break;
            }
            CadastroUser.super.dispose();
        }

    }
    
}
