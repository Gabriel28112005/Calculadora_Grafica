package org.example.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculadoraVistaMatriz2 extends JFrame {

    public CalculadoraVistaMatriz2(){

        //FRAMES
        JFrame frame = new JFrame("Calculadora Matriz 2x2");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null); //La ventana se centra en la pantalla
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //PANTALLA

        JTextField pantalla = new JTextField();
        pantalla.setEditable(false); // La pantalla no es editable por el usuario
        pantalla.setFont(new Font("Arial", Font.PLAIN, 24)); // Establece la fuente y tamaño de la pantalla
        pantalla.setHorizontalAlignment(JTextField.CENTER); // Alinea el texto a la derecha
        pantalla.setPreferredSize(new Dimension(400, 200)); // Establece el tamaño preferido de la pantalla


        //PANELES

        JPanel panelPantalla = new JPanel();

        JPanel panelBotones = new JPanel();









        panelPantalla.add(pantalla, BorderLayout.NORTH); // Añade la pantalla al panel principal
        frame.add(panelPantalla, BorderLayout.NORTH); // Añade el panel al centro del panel principal

    } //Fin del constructor CalculadoraVistaMatriz2


} //Fin de la clase CalculadoraVistaMatriz2