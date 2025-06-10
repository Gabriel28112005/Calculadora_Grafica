package org.example.vista;

import javax.swing.*;
import java.awt.*;

import org.example.modelo.CalculadoraModeloBasica;

public class CalculadoraVistaBasica extends JFrame{
    public CalculadoraVistaBasica(){

        // FRAMES
        JFrame frameBasico = new JFrame("Calculadora Básica");
        frameBasico.setSize(400, 400);
        frameBasico.setLocationRelativeTo(null);
        frameBasico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBasico.setVisible(true);


        // PANELES

        JPanel panel = new JPanel(new GridLayout(6, 4, 5,5));


        // CREACIÓN DE LA PANTALLA DONDE SE REFLEJAN LAS OPERACIONES
        JTextField pantalla = new JTextField();
        pantalla.setEditable(false); // No se puede editar directamente
        pantalla.setHorizontalAlignment(JTextField.RIGHT); // Alineación del texto a la derecha
        pantalla.setFont(new Font("Arial", Font.PLAIN, 24)); // Fuente y tamaño del texto
        pantalla.setBackground(Color.WHITE); // Color de fondo de la pantalla
        pantalla.setPreferredSize(new Dimension(400, 50)); // Tamaño preferido de la pantalla
        pantalla.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Borde de la pantalla
        pantalla.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espaciado interno de la pantalla


        //Escritura de botones
        String botones[]= {
                "%", "CE", "C", "⌫",
                "1/x", "x²", "√x", "÷",
                "7", "8", "9", "x",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "+/-", "0", ".", "="
        };

        for(String Seleccion : botones){
            JButton botonSeleccion = new JButton(Seleccion);
            panel.add(botonSeleccion);

            final String SeleccionFinal = Seleccion;

            botonSeleccion.addActionListener(e->{

                String textoActual = pantalla.getText();

                if(SeleccionFinal.equals("%")){
                    try{
                        double NumeroActual = Double.parseDouble(textoActual); // Convierte el texto actual de la pantalla a un número.
                        double porcentaje = NumeroActual / 100; // Calcula el porcentaje del número actual.
                        pantalla.setText(String.valueOf(porcentaje)); // Actualiza la pantalla con el resultado del porcentaje.



                    }catch(Exception CualquierCosa) {
                        //JOptionPane.showMessageDialog(null, "Error al calcular el porcentaje", "Error", JOptionPane.ERROR_MESSAGE);
                        pantalla.setText("Syntax Error"); // Si hay un error al convertir el texto a número, se muestra "Error" en la pantalla.
                    }
                } //Fin del botón "%"


                else if(SeleccionFinal.equals("CE") || SeleccionFinal.equals("C")) {
                    pantalla.setText(""); // Si el texto actual es "C" o "CE", se limpia la pantalla.
                } //Fin del botón "C", "CE"


                else if(SeleccionFinal.equals("⌫")){
                    if(!textoActual.isEmpty()){
                        String nuevoTexto = textoActual.substring(0, textoActual.length() - 1); // Elimina el último carácter del texto actual.
                        pantalla.setText(nuevoTexto); // Actualiza la pantalla con el nuevo texto.
                    }
                } //Fin del botón "⌫"


                else if(SeleccionFinal.equals("1/x")){
                    try{
                        double NumeroActual = Double.parseDouble(textoActual); // Convierte el texto actual de la pantalla a un número.
                        double fraccion = 1 / NumeroActual; // Calcula el porcentaje del número actual.

                        if(NumeroActual == 0) {
                            pantalla.setText("∞"); // Si el número es cero, muestra "Error" en la pantalla.
                        }

                        else{
                            if( fraccion % 1 == 0) {
                                pantalla.setText(String.valueOf((int) fraccion)); // Si el resultado es un número entero, lo muestra como tal.
                            } else {
                                pantalla.setText(String.valueOf(fraccion)); // Si no, muestra el resultado como un número decimal.
                            }
                        }

                    }catch(Exception CualquierCosa) {
                        //JOptionPane.showMessageDialog(null, "Error al calcular el porcentaje", "Error", JOptionPane.ERROR_MESSAGE);
                        pantalla.setText("Syntax Error"); // Si hay un error al convertir el texto a número, se muestra "Error" en la pantalla.
                    }
                } //Fin del botón "1/x"


                else if(SeleccionFinal.equals("x²")){
                    try{
                        if(textoActual.contains(".")){
                            Double NumeroActual = Double.parseDouble(textoActual); // Convierte el texto actual de la pantalla a un número.
                            Double Cuadrado = Math.pow(NumeroActual,2); // Calcula el cuadrado del número actual.
                            pantalla.setText(String.valueOf(Cuadrado)); // Actualiza la pantalla con el resultado del cuadrado.
                        }
                        else{
                            Integer NumeroActual = Integer.parseInt(textoActual); // Convierte el texto actual de la pantalla a un número.
                            Integer Cuadrado = NumeroActual * NumeroActual; // Calcula el cuadrado del número actual.
                            pantalla.setText(String.valueOf(Cuadrado)); // Actualiza la pantalla con el resultado del cuadrado.
                        }

                    }catch(Exception CualquierCosa){
                        pantalla.setText("Syntax Error"); // Si hay un error al convertir el texto a número, se muestra "Error" en la pantalla.

                    }

                } //Fin del botón "x²"


                else if(SeleccionFinal.equals("√x")){
                    try{
                        double NumeroActual = Double.parseDouble(textoActual); // Convierte el texto actual de la pantalla a un número.
                        double RaizCuadrada = Math.sqrt(NumeroActual); // Calcula el cuadrado del número actual.

                        if (NumeroActual < 0) {
                            pantalla.setText("Syntax Error"); // Si el número es negativo, muestra "Error" en la pantalla.
                        }
                        else if(RaizCuadrada == Math.floor(RaizCuadrada)) { // Verifica si la raíz cuadrada es un número entero.
                            pantalla.setText(String.valueOf((int) RaizCuadrada)); // Actualiza la pantalla con el resultado del cuadrado.
                        }
                        else{
                            pantalla.setText(String.valueOf(RaizCuadrada)); // Actualiza la pantalla con el resultado del cuadrado.
                        }

                    }catch(Exception CualquierCosa){
                        pantalla.setText("Syntax Error"); // Si hay un error al convertir el texto a número, se muestra "Error" en la pantalla.

                    }

                } //Fin del botón "√x"


                else if (SeleccionFinal.equals("+/-")){
                    if(textoActual.contains("-")){
                        pantalla.setText(textoActual.replace("-", "")); // Si el texto actual contiene un "-", se elimina.
                    } else {
                        pantalla.setText("-" + textoActual); // Si no, se agrega un "-" al inicio del texto actual.
                    }

                } //Fin del botón "+/-"

                else if(SeleccionFinal.equals("=")) {
                    try{
                        if(textoActual.contains("+")){
                            String[] partes = textoActual.split("\\+");
                            double a = Double.parseDouble(partes[0]);
                            double b = Double.parseDouble(partes[1]);
                            double resultado = CalculadoraModeloBasica.suma(a, b);

                            if(resultado == Math.floor(resultado)) {
                                pantalla.setText(String.valueOf((int) resultado)); // Si el resultado es un número entero, lo muestra como tal.
                            } else {
                                pantalla.setText(String.valueOf(resultado)); // Si no, muestra el resultado como un número decimal.
                            }
                        } //Fin del caso en que la operación sea la suma de dos números

                        else if (textoActual.contains("-")){
                            String[] partes = textoActual.split("-");
                            double a = Double.parseDouble(partes[0]);
                            double b = Double.parseDouble(partes[1]);
                            double resultado = CalculadoraModeloBasica.resta(a, b);

                            if(resultado == Math.floor(resultado)) {
                                pantalla.setText(String.valueOf((int) resultado)); // Si el resultado es un número entero, lo muestra como tal.
                            } else {
                                pantalla.setText(String.valueOf(resultado)); // Si no, muestra el resultado como un número decimal.
                            }

                        } //Fin del caso en el que la operación sea la resta de dos números


                        else if (textoActual.contains("x")){
                            String[] partes = textoActual.split("x");
                            double a = Double.parseDouble(partes[0]);
                            double b = Double.parseDouble(partes[1]);
                            double resultado = CalculadoraModeloBasica.multiplicacion(a, b);

                            if(resultado == Math.floor(resultado)) {
                                pantalla.setText(String.valueOf((int) resultado)); // Si el resultado es un número entero, lo muestra como tal.
                            } else {
                                pantalla.setText(String.valueOf(resultado)); // Si no, muestra el resultado como un número decimal.
                            }

                        } //Fin del caso en el que la operación sea la multiplicación de dos números


                        else if (textoActual.contains("÷")){
                            String[] partes = textoActual.split("÷");
                            double a = Double.parseDouble(partes[0]);
                            double b = Double.parseDouble(partes[1]);
                            double resultado = CalculadoraModeloBasica.division(a, b);

                            if(resultado == Math.floor(resultado)) {
                                pantalla.setText(String.valueOf((int) resultado)); // Si el resultado es un número entero, lo muestra como tal.
                            } else {
                                pantalla.setText(String.valueOf(resultado)); // Si no, muestra el resultado como un número decimal.
                            }

                        } //Fin del caso en el que la operación sea la división de dos números


                        else {
                            pantalla.setText(textoActual); // Si no hay ningún operador, se muestra el texto actual.
                        }
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null, "La calculadora únicamente puede realizar operaciones básicas (suma, resta, multiplicación o división) con dos números. Por favor, vuelva a intentarlo.", "Error en la operación", JOptionPane.WARNING_MESSAGE);
                    }




                } //Fin del botón "="

                else {
                    pantalla.setText(textoActual + SeleccionFinal); // En cualquier otro caso, se agrega el botón presionado al texto actual.

                } //Imprime en la pantalla tanto números como los botones "+", "-", "x", "÷" y "."

            });


        }



        // ADICIÓN DEL PANEL PRINCIPAL AL FRAME
        frameBasico.add(pantalla, BorderLayout.NORTH); // Añade la pantalla arriba de los botones
        frameBasico.add(panel, BorderLayout.CENTER);
    }


}//Fin de la clase CalculadoraVistaBasica