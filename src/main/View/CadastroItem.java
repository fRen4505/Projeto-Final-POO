package Projec.View;

import Projec.Model.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class CadastroItem extends JFrame implements ActionListener{

    private ArrayList<Items>items;
    private Random rand = new Random();
    private TextField itemDescri, itemNome, itemQtnd;
    private JButton Finalizar;

    public CadastroItem(ArrayList<Items>itm){
        items = itm;
        setSize(800, 600);
        setTitle("Cadastro de Items");
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);//centro da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //campo para colocar nome de item
        itemNome = new TextField();
        itemNome.setSize(300, 30);
        itemNome.setLocation(500, 250);
        add(itemNome);

        //campo para colocar descrição de item
        itemDescri = new TextField();
        itemDescri.setSize(300, 30);
        itemDescri.setLocation(500, 310);
        add(itemDescri);

        //campo para colocar quantidade de item, somente numero
        itemQtnd = new TextField();
        itemQtnd.setSize(300, 30);
        itemQtnd.setLocation(500, 365);
        add(itemQtnd);

        //botao para finalizar o cadastro de item
        Finalizar = new JButton("Finalizar");
        Finalizar.setSize(100, 30);
        Finalizar.setLocation(600, 400);
        Finalizar.setFocusable(false);
        Finalizar.addActionListener(this);
        add(Finalizar);

    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        Integer ID = rand.nextInt();

        Items prod = new Items(ID, itemDescri.getText(), itemNome.getText(), Integer.parseInt(itemQtnd.getText()));
        items.add(prod);

        CadastroItem.super.dispose();
    }
    
}
