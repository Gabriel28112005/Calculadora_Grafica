package org.example.modelo;

public class CalculadoraModeloMatriz2 {
    public double A;
    public double B;
    public double C;
    public double D;

    public double A2;
    public double B2;
    public double C2;
    public double D2;

    public static void Multiplicar2 (double A, double B, double C, double D, double A2, double B2, double C2, double D2) {
        double A3 = A * A2 + B * C2;
        double B3 = A * B2 + B * D2;
        double C3 = C * A2 + D * C2;
        double D3 = C * B2 + D * D2;

        System.out.println("El resultado de la multiplicacion es:\n");

        System.out.println("("+A3+"   "+B3+")\n" +
                           "("+C3+"   "+D3+")");
    }

    public static void Sumar2 (double A, double B, double C, double D, double A2, double B2, double C2, double D2) {
        double A3 = A + A2;
        double B3 = B + B2;
        double C3 = C + C2;
        double D3 = D + D2;

        System.out.println("El resultado de la suma es:\n");

        System.out.println("("+A3+"   "+B3+")\n" +
                           "("+C3+"   "+D3+")");
    }

    public static void Restar2 (double A, double B, double C, double D, double A2, double B2, double C2, double D2) {
        double A3 = A - A2;
        double B3 = B - B2;
        double C3 = C - C2;
        double D3 = D - D2;

        System.out.println("El resultado de la resta es:\n");

        System.out.println("("+A3+"   "+B3+")\n" +
                           "("+C3+"   "+D3+")");
    }


} //Fin de la clase CalculadoraModeloMatriz2