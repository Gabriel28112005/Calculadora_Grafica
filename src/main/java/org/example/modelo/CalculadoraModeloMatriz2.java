package org.example.modelo;

public class CalculadoraModeloMatriz2 {
    public double A, B, C, D;

    public double A2, B2, C2, D2;

    public static void Multiplicar2 (double A, double B, double C, double D, double A2, double B2, double C2, double D2) {
        double A3 = A * A2 + B * C2;
        double B3 = A * B2 + B * D2;
        double C3 = C * A2 + D * C2;
        double D3 = C * B2 + D * D2;
    }

    public static void Sumar2 (double A, double B, double C, double D, double A2, double B2, double C2, double D2) {
        double A3 = A + A2;
        double B3 = B + B2;
        double C3 = C + C2;
        double D3 = D + D2;
    }

    public static void Restar2 (double A, double B, double C, double D, double A2, double B2, double C2, double D2) {
        double A3 = A - A2;
        double B3 = B - B2;
        double C3 = C - C2;
        double D3 = D - D2;

    }

    public static void Determinante3 (double A,double B,double C,double D){
        double determinante = det_2(A,B,C,D);

    } //Función para calcular el determinante de una matriz 3x3



    public static double det_2(double A, double B, double C, double D){
        double ResultadoFinal_2 = (A*D)-(B*C);
        return ResultadoFinal_2;
    } //Fórmula para resolver determinantes de orden 2 (dimensión 2x2)


} //Fin de la clase CalculadoraModeloMatriz2