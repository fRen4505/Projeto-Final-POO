package Projec.View;

import Projec.Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Solicitar extends JFrame implements ActionListener{

    private JPanel listaPai = new JPanel();
    private JButton prodLista, Pegar, Deixar;
    private ArrayList<Items> itemsCadas;

    public Solicitar(ArrayList<Items>livr){
        this.itemsCadas = livr;
        setSize(800, 600);
        setTitle("Solicitar emprestimo");
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listaPai.setSize(1300, 500);
        listaPai.setLocation(25, 25);
        listaPai.setLayout(new GridLayout(0, itemsCadas.size(), 15, 0));
        listaPai.setBackground(Color.BLUE); 

        add(listaPai);
        
        for (int l = 0; l < itemsCadas.size(); l++) {
            prodLista = new JButton("Livro: "+ itemsCadas.get(l).getNome() + "\t ID: "+itemsCadas.get(l).getIDItem()+"\t -Disponivel: "+itemsCadas.get(l).getDispo()+"\n");
            prodLista.setLocation(25, 25);
            prodLista.setFocusable(false);
            prodLista.setEnabled(false);

            listaPai.add(prodLista);
        }

        Pegar = new JButton("Emprestar");
        Pegar.setSize(100, 50);
        Pegar.setLocation(25, 540);
        Pegar.setFocusable(false);
        Pegar.addActionListener(this);

        Deixar = new JButton("Devolver");
        Deixar.setSize(100, 50);
        Deixar.setLocation(25, 600);
        Deixar.setFocusable(false);
        Deixar.addActionListener(this);

        add(Pegar);
        add(Deixar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== Pegar) {
            for (int i = 0; i < listaPai.getComponentCount(); i++) {
                if ( itemsCadas.get(i).getDispo() == true ) {
                    listaPai.getComponent(i).setEnabled(true);
                }
                else{
                    listaPai.getComponent(i).setEnabled(false);
                }
            }
        }
        if (e.getSource()== Deixar) {
            
        }
        
    }
    
}
