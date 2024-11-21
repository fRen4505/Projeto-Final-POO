package Projec.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Login extends JFrame implements WindowListener, ActionListener{

    private Dimension telaTama = new Dimension(800,600);
    private Dimension text, log, botSize;
    private TextField emailIns, senhaIns, cargoIns;
    private Label email, senha, cargo;

    public Login(){
        text = new Dimension(70,25);
        log = new Dimension(200, 25);
        botSize = new Dimension(70, 35);

        //tela
        setSize(telaTama);
        setTitle("Login");
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //email label e inserção
        email = new Label("Email : ");
        email.setSize(text);
        email.setLocation(250, 200);

        emailIns = new TextField(null);
        emailIns.setSize(log);
        emailIns.setLocation(270, 200);

        add(email);
        add(emailIns);

        //senha label e inserção
        senha = new Label("Senha : ");
        senha.setSize(text);
        senha.setLocation(250, 250);

        senhaIns = new TextField(null);
        senhaIns.setSize(log);
        senhaIns.setLocation(270, 250);

        add(senha);
        add(senhaIns);

        //cargo label e inserção
        cargo = new Label("Cargo : ");
        cargo.setSize(text);
        cargo.setLocation(250, 300);

        cargoIns = new TextField(null);
        cargoIns.setSize(log);
        cargoIns.setLocation(270, 300);

        add(cargo);
        add(cargoIns);

        //botão
        Button logConfirm = new Button("Confirma");
        logConfirm.setSize(botSize);
        logConfirm.setLocation(350, 350);

        add(logConfirm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
