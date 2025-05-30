package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class CalculadoraVistaBasica extends JFrame{

    public CalculadoraVistaBasica(){

        // FRAMES

        JFrame frameBasico = new JFrame("Calculadora Básica");
        frameBasico.setSize(400, 400);
        frameBasico.setLocationRelativeTo(null);
        frameBasico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBasico.setVisible(true);

        // PANELES

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel panel2 = new JPanel(new GridLayout(6, 4, 5,5));




        //BOTONES:

        JButton botonPorcentaje = new JButton("%"); // Fila = 1, Columna = 1
        JButton botonCE = new JButton("CE"); // Fila = 1, Columna = 2
        JButton botonEliminarTodo = new JButton("C"); // Fila = 1, Columna = 3
        JButton botonEliminarUno = new JButton("⌫"); // Fila = 1, Columna = 4

        JButton botonInverso = new JButton("1/x"); // Fila = 2, Columna = 1
        JButton botoncuadrado = new JButton("x²"); // Fila = 2, Columna = 2
        JButton botonRaizCuadrada = new JButton("√x"); // Fila = 2, Columna = 3
        JButton botonDivision = new JButton("÷"); // Fila = 2, Columna = 4

        JButton boton7 = new JButton("7"); // Fila = 3, Columna = 1
        JButton boton8 = new JButton("8"); // Fila = 3, Columna = 2
        JButton boton9 = new JButton("9"); // Fila = 3, Columna = 3
        JButton botonMultiplicacion = new JButton("x"); // Fila = 3, Columna = 4

        JButton boton4 = new JButton("4"); // Fila = 4, Columna = 1
        JButton boton5 = new JButton("5"); // Fila = 4, Columna = 2
        JButton boton6 = new JButton("6"); // Fila = 4, Columna = 3
        JButton botonResta = new JButton("-"); // Fila = 4, Columna = 4

        JButton boton1 = new JButton("1"); // Fila = 5, Columna = 1
        JButton boton2 = new JButton("2"); // Fila = 5, Columna = 2
        JButton boton3 = new JButton("3"); // Fila = 5, Columna = 3
        JButton botonSuma = new JButton("+"); // Fila = 5, Columna = 4

        JButton botonSigno = new JButton("+/-"); // Fila = 6, Columna = 1
        JButton boton0 = new JButton("0"); // Fila = 6, Columna = 2
        JButton botonPunto = new JButton("."); // Fila = 6, Columna = 3
        JButton botonIgual = new JButton("="); // Fila = 6, Columna = 4




        // CONFIGURACIÓN DE LOS BOTONES


        Dimension tamañoBoton = new Dimension(1, 1);

        //Botón suma +

        /*

        botonSuma.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botonSuma.setMaximumSize(tamañoBoton);
        botonSuma.setMinimumSize(tamañoBoton);
        botonSuma.setPreferredSize(tamañoBoton);


        //Botón resta -
        //botonResta.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botonResta.setMaximumSize(tamañoBoton);
        botonResta.setMinimumSize(tamañoBoton);
        botonResta.setPreferredSize(tamañoBoton);


        //Botón multiplicación x
        //botonMultiplicacion.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botonMultiplicacion.setMaximumSize(tamañoBoton);
        botonMultiplicacion.setMinimumSize(tamañoBoton);
        botonMultiplicacion.setPreferredSize(tamañoBoton);


        //Botón división ÷
        //botonDivision.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botonDivision.setMaximumSize(tamañoBoton);
        botonDivision.setMinimumSize(tamañoBoton);
        botonDivision.setPreferredSize(tamañoBoton);


        //Botón eliminar todo C
        //botonEliminarTodo.setAlignmentX(Component.);
        botonEliminarTodo.setMaximumSize(tamañoBoton);
        botonEliminarTodo.setMinimumSize(tamañoBoton);
        botonEliminarTodo.setPreferredSize(tamañoBoton);


        //Botón eliminar uno ⌫
        //botonEliminarUno.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botonEliminarUno.setMaximumSize(tamañoBoton);
        botonEliminarUno.setMinimumSize(tamañoBoton);
        botonEliminarUno.setPreferredSize(tamañoBoton);


        //Botón igual =
        //botonIgual.setAlignmentX(Component.RIGHT_ALIGNMENT);
        botonIgual.setMaximumSize(tamañoBoton);
        botonIgual.setMinimumSize(tamañoBoton);
        botonIgual.setPreferredSize(tamañoBoton);


         */


        // ADICIÓN DE BOTONES AL PANEL

       // panel2.add(Box.createVerticalStrut(100));  //Para establecer un espacio vertical definido (100 píxeles en este caso)

        panel2.add(botonPorcentaje);
        panel2.add(botonCE);
        panel2.add(botonEliminarTodo);
        panel2.add(botonEliminarUno);

        panel2.add(botonInverso);
        panel2.add(botoncuadrado);
        panel2.add(botonRaizCuadrada);
        panel2.add(botonDivision);

        panel2.add(boton7);
        panel2.add(boton8);
        panel2.add(boton9);
        panel2.add(botonMultiplicacion);

        panel2.add(boton4);
        panel2.add(boton5);
        panel2.add(boton6);
        panel2.add(botonResta);

        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);
        panel2.add(botonSuma);

        panel2.add(botonSigno);
        panel2.add(boton0);
        panel2.add(botonPunto);
        panel2.add(botonIgual);

        // ADICIÓN DEL PANEL PRINCIPAL AL FRAME
        frameBasico.add(panel2, BorderLayout.CENTER);
    }


}//Fin de la clase CalculadoraVistaBasica