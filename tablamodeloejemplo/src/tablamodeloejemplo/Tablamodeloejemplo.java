/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tablamodeloejemplo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.LinkedList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author usuario
 */
public class Tablamodeloejemplo {

    LinkedList linked;
    JTable table;
    JFrame frame;
    JPanel panel;
    tablemodel tm;
    Modelo modelo;
    JScrollPane jsp;
    public Tablamodeloejemplo(){
        frame = new JFrame();
        frame.add(panel());
        frame.setSize(600, 500);
        frame.setVisible(true);
    }
    public JPanel panel(){
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(contenedor_up(),BorderLayout.NORTH);
        panel.add(contenedor_left(),BorderLayout.WEST);
        panel.add(contenedor_rigth(),BorderLayout.EAST);
        panel.setVisible(true);
        return panel;
    }
    public Container contenedor_up(){
       Container contenedor = new Container();
            contenedor.setLayout(new FlowLayout());
            contenedor.add(new JButton("Boton arriba"));
            contenedor.setSize(new Dimension(5, 10));
        return contenedor;
    }
    public Container contenedor_left(){
       Container contenedor = new Container();
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));
        contenedor.add(new JButton("boton izquierdo"));
        contenedor.setSize(new Dimension(5, 10));
        return contenedor;
    }
    public Container contenedor_rigth(){
        Container contenedor = new Container();
        contenedor.setLayout(new FlowLayout());
        modelo = new Modelo();
        modelo.setCosa1("Uno");
        modelo.setCosa2("Dos");
        modelo.setCosa3("Tres");
        JScrollPane jsp = new JScrollPane();
        tm = new tablemodel(modelo);
        table = new JTable(tm);
        jsp.setViewportView(table);
        contenedor.add(new JButton("Boton derecho"));
        contenedor.add(jsp);
        return contenedor;
    }
    
    public static void main(String[] args) {
        new Tablamodeloejemplo();
        
    }
    
}
