package org.example;

import java.util.Scanner;
import java.util.*;

public class asknlask {
    public static void main(String[] args) {




            Scanner scanner = new Scanner(System.in);

            System.out.println("Vamos a realizar el algoritmo de Euclides");

            System.out.print("Dime el valor de A: ");
            int A = scanner.nextInt();
            System.out.print("Dime el valor de B: ");
            int B = scanner.nextInt();

            while(A%B != 0){
                System.out.print("\n\n");

                int C = Valor_C(A, B);  // Se calcula el cociente
                int R = Valor_R(A, B, C); // Se calcula el resto

                System.out.println(A+"       |  "+B);
                System.out.println("         ------------");
                System.out.println(R+"           "+C);
                System.out.print("\n\n");

                // Ahora actualizamos A y B
                A = B;
                B = R;  // Usamos el resto como nuevo B
            }

            System.out.print("\n\n");

            System.out.println(A+"       |  "+B);
            System.out.println("         ------------");

            System.out.println(Valor_R(A,B,Valor_C(A,B))+"           "+Valor_C(A,B));



    }

    public static int Valor_C (int A, int B){
        return A/B;
    }

    public static int Valor_R (int A, int B, int C){
        return A-(C*B);
    }


}
