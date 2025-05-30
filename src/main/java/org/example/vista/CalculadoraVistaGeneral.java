package org.example.vista;

import javax.swing.*;
import java.awt.*;

import org.example.vista.CalculadoraVistaBasica;

public class CalculadoraVistaGeneral {
    public static void main(String[] ars){
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel etiqueta = new JLabel("Seleccione una calculadora:");
        etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etiqueta);

        JButton botonBasica = new JButton("Calculadora Básica");
        botonBasica.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botonMatriz2 = new JButton("Calculadora Matriz 2x2");
        botonMatriz2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botonMatriz3 = new JButton("Calculadora Matriz 3x3");
        botonMatriz3.setAlignmentX(Component.CENTER_ALIGNMENT);

        botonBasica.addActionListener(e->{
            frame.dispose(); // Cierra la ventana actual
            CalculadoraVistaBasica vistaBasica = new CalculadoraVistaBasica(); // Crea una nueva instancia de la vista básica




        });







        panel.add(Box.createVerticalStrut(10));
        panel.add(botonBasica);
        panel.add(Box.createVerticalStrut(10));
        panel.add(botonMatriz2);
        panel.add(Box.createVerticalStrut(10));
        panel.add(botonMatriz3);

        frame.add(panel);


        frame.setVisible(true);


    }//Fin del public static void main(String[] args)




} //Fin de la clase CalculadoraVistaGeneral