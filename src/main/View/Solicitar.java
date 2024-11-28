package Projec.View;

import Projec.Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Solicitar extends JFrame implements ActionListener{

    private JPanel listaPai = new JPanel();
    private JButton prodLista, Pegar, voltar;
    private ArrayList<Items> itemsCadas;

    public Solicitar(ArrayList<Items>livr){
        this.itemsCadas = livr;
        setSize(800, 600);
        setTitle("Comprar");
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //for para adicionar items a painel de listagem 
        for (int l = 0; l < itemsCadas.size(); l++) {

            //painel de produtos cadastrados e suas caracteristicas graficas
            listaPai.setSize(900, 600);
            listaPai.setLocation(25, 25);
            //listaPai.setBackground(Color.BLUE); 

            add(listaPai);

            if ( !itemsCadas.isEmpty() ) {

                //layout de painel da lista
                listaPai.setLayout(new GridLayout(itemsCadas.size(), 0, 0, 15));

                //botoes e lista de produtos
                prodLista = new JButton("Livro: "+ itemsCadas.get(l).getDescri() + "\t ID: "+itemsCadas.get(l).getIDItem()+"\t -Disponivel: "+itemsCadas.get(l).getDispo()+"\n");
                prodLista.setLocation(25, 25);
                prodLista.setFocusable(false);
                prodLista.setEnabled(false);

                if ( itemsCadas.get(l).getDispo() == true ) {
                    prodLista.setEnabled(true);
                }
                
                listaPai.add(prodLista);

            } else {
                JLabel info = new JLabel();
                info.setSize(90, 90);
                info.setLocation(JLabel.CENTER, JLabel.CENTER);
                listaPai.add(info);

            }
            
        }

        //botao para comprar
        Pegar = new JButton("Comprar");
        Pegar.setSize(100, 50);
        Pegar.setLocation(1000, 300);
        Pegar.setFocusable(false);
        Pegar.addActionListener(this);

        //botao de voltar e fechar tela
        voltar = new JButton("Voltar");
        voltar.setSize(70, 20);
        voltar.setLocation(1000, 100);
        voltar.setFocusable(false);
        voltar.addActionListener(this);

        add(voltar);
        add(Pegar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== Pegar) {
           
        }

        if (e.getSource()== voltar) {
           Solicitar.super.dispose();
        }
    
    }
    
}
