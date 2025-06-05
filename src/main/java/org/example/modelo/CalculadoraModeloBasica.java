package org.example.modelo;

public class CalculadoraModeloBasica {
    public static double suma(double a, double b) {
        return a + b;
    } //Fin de la función suma

    public static double resta(double a, double b) {
        return a - b;
    } //Fin de la función resta

    public static double multiplicacion(double a, double b) {
        return a * b;
    } //Fin de la función multiplicacion

    public static double division(double a, double b) {

        if (b == 0) {
            System.out.print("SyntaxError");
        }

        else if (a%b !=0){
            String resultado = a + "/" + b;

            System.out.print(resultado);
        } //Caso en el que la división no sea entera
        return a / b;

    } //Fin de la función division


} //Fin de la clase CalculadoraModeloBasica