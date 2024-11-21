package Projec.View;

import Projec.Model.Estoque;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EstInter extends JFrame implements WindowListener, ActionListener{

    private Dimension telaTama = new Dimension(800,600);
    private Dimension invenTama = new Dimension(650, 510);
    private TextArea inven;

    public EstInter(Estoque esto){
        setSize(telaTama);
        setTitle("Estoque");
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button novLot = new Button("Novo Lote");
        novLot.setSize(55, 30);
        novLot.setLocation(740, 70);
        add(novLot);

        inven = new TextArea();
        inven.setSize(invenTama);
        inven.setLocation(20, 20);
        for (int i = 0; i < esto.getEstoqueSize(); i++) {
            inven.append(esto.getItemsInfos(i));
        }

        addWindowListener(this);
        add(inven);
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
