package org.example.modelo;

public class CalculadoraModeloMatriz3 {
    public double A;
    public double B;
    public double C;
    public double D;
    public double E;
    public double F;
    public double G;
    public double H;
    public double I;

    public double A2;
    public double B2;
    public double C2;
    public double D2;
    public double E2;
    public double F2;
    public double G2;
    public double H2;
    public double I2;


    public static void Multiplicar3 (double A,double B,double C,double D,double E,double F,double G,double H,double I, double A2,double B2,double C2,double D2,double E2,double F2,double G2,double H2,double I2){
        double A3 = A * A2 + B * D2 + C * G2;
        double B3 = A * B2 + B * E2 + C * H2;
        double C3 = A * C2 + B * F2 + C * I2;
        double D3 = D * A2 + E * D2 + F * G2;
        double E3 = D * B2 + E * E2 + F * H2;
        double F3 = D * C2 + E * F2 + F * I2;
        double G3 = G * A2 + H * D2 + I * G2;
        double H3 = G * B2 + H * E2 + I * H2;
        double I3 = G * C2 + H * F2 + I * I2;

        System.out.println("La matriz resultante al multiplicar es:\n");

        System.out.println("("+A3+"   "+B3+"   "+C3+")\n" +
                           "("+D3+"   "+E3+"   "+F3+")\n" +
                           "("+G3+"   "+H3+"   "+I3+")");
    }


    public static void Sumar3(double A,double B,double C,double D,double E,double F,double G,double H,double I, double A2,double B2,double C2,double D2,double E2,double F2,double G2,double H2,double I2){
        double A3 = A + A2;
        double B3 = B + B2;
        double C3 = C + C2;
        double D3 = D + D2;
        double E3 = E + E2;
        double F3 = F + F2;
        double G3 = G + G2;
        double H3 = H + H2;
        double I3 = I + I2;

        System.out.println("La matriz resultante al sumar es:\n");

        System.out.println("("+A3+"   "+B3+"   "+C3+")\n" +
                           "("+D3+"   "+E3+"   "+F3+")\n" +
                           "("+G3+"   "+H3+"   "+I3+")");
    }

    public static void Restar3 (double A,double B,double C,double D,double E,double F,double G,double H,double I, double A2,double B2,double C2,double D2,double E2,double F2,double G2,double H2,double I2){
        double A3 = A - A2;
        double B3 = B - B2;
        double C3 = C - C2;
        double D3 = D - D2;
        double E3 = E - E2;
        double F3 = F - F2;
        double G3 = G - G2;
        double H3 = H - H2;
        double I3 = I - I2;

        System.out.println("La matriz resultante al restar es:\n");

        System.out.println("("+A3+"   "+B3+"   "+C3+")\n" +
                           "("+D3+"   "+E3+"   "+F3+")\n" +
                           "("+G3+"   "+H3+"   "+I3+")");
    }

    public static void Determinante3 (double A,double B,double C,double D,double E,double F,double G,double H,double I){
        double determinante = det_3(A,B,C,D,E,F,G,H,I);

        System.out.print("\n| "+A+"   "+B+"   "+C+"|\n");
        System.out.print("\n| "+D+"   "+E+"   "+F+"|= "+determinante+"\n");
        System.out.print("\n| "+G+"   "+H+"   "+I+"|\n");
    } //Función para calcular el determinante de una matriz 3x3






    public static double det_3(double A, double B, double C, double D, double E, double F, double G, double H, double I){
        double lin1 = (A*E*I)+(B*F*G)+(D*H*C);
        double lin2 = (C*E*G)+(B*D*I)+(F*H*A);
        double ResultadoFinal_3 = lin1-lin2;
        return ResultadoFinal_3;
    } //Fórmula para resolver determinantes de orden 3 (dimensión 3x3)

} //Fin de la clase CalculadoraModeloMatriz3