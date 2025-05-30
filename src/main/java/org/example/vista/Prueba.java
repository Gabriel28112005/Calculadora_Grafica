package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class Prueba {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Básica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        // Barra superior para mostrar operaciones
        JTextField pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setBackground(Color.WHITE);
        pantalla.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.add(pantalla, BorderLayout.NORTH);

        // Panel de botones con GridLayout
        JPanel panelBotones = new JPanel(new GridLayout(6, 4, 5, 5));
        String[] botones = {
                "%", "CE", "C", "⌫",
                "1/x", "x²", "√", "÷",
                "7", "8", "9", "x",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "+/-", "0", ".", "="
        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.PLAIN, 16));
            panelBotones.add(boton);

            // Ejemplo: actualizar pantalla cuando se presiona un número
            boton.addActionListener(e -> {
                String actual = pantalla.getText();
                pantalla.setText(actual + texto);
            });
        }

        frame.add(panelBotones, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}