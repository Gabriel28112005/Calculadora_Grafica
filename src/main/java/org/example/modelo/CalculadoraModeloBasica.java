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

    public static void DecimalAEntero(double a) {
        // Casos especiales
        if (Double.isNaN(a) || Double.isInfinite(a)) {
            System.out.print("Error: No se puede convertir");
            return;
        }

        // Si es entero
        if (a == Math.floor(a)) {
            System.out.print((int)a + "/1");
            return;
        }

        boolean esNegativo = a < 0;
        a = Math.abs(a);

        // Separar parte entera y decimal
        long parteEntera = (long) a;
        double parteDecimal = a - parteEntera;

        // Convertir parte decimal a string para análisis
        String decimalStr = String.format("%.15f", parteDecimal).substring(2);

        // Remover ceros del final
        while (decimalStr.length() > 0 && decimalStr.charAt(decimalStr.length() - 1) == '0') {
            decimalStr = decimalStr.substring(0, decimalStr.length() - 1);
        }

        if (decimalStr.isEmpty()) {
            System.out.print((esNegativo ? "-" : "") + parteEntera + "/1");
            return;
        }

        // Buscar patrón repetitivo
        String patron = null;
        int inicioRepeticion = -1;

        // Buscar patrones de longitud 1 a 6
        for (int longitud = 1; longitud <= Math.min(6, decimalStr.length() / 3) && patron == null; longitud++) {
            for (int inicio = 0; inicio <= decimalStr.length() - longitud * 3 && patron == null; inicio++) {
                String candidato = decimalStr.substring(inicio, inicio + longitud);
                int repeticiones = 0;

                // Contar repeticiones consecutivas
                for (int pos = inicio; pos + longitud <= decimalStr.length(); pos += longitud) {
                    if (decimalStr.substring(pos, pos + longitud).equals(candidato)) {
                        repeticiones++;
                    } else {
                        break;
                    }
                }

                if (repeticiones >= 3) {
                    patron = candidato;
                    inicioRepeticion = inicio;
                }
            }
        }

        long numerador, denominador;

        if (patron != null) {
            // Es periódico
            String noRepetitiva = decimalStr.substring(0, inicioRepeticion);
            int longNoRep = noRepetitiva.length();
            int longRep = patron.length();

            if (longNoRep == 0) {
                // Periódico puro
                long valorRepetitivo = Long.parseLong(patron);
                denominador = (long) Math.pow(10, longRep) - 1;
                numerador = parteEntera * denominador + valorRepetitivo;
            } else {
                // Periódico mixto
                long valorNoRep = noRepetitiva.isEmpty() ? 0 : Long.parseLong(noRepetitiva);
                long valorRep = Long.parseLong(patron);
                long combinado = Long.parseLong(noRepetitiva + patron);

                numerador = combinado - valorNoRep + parteEntera *
                        ((long) Math.pow(10, longRep) - 1) * (long) Math.pow(10, longNoRep);
                denominador = ((long) Math.pow(10, longRep) - 1) * (long) Math.pow(10, longNoRep);
            }
        } else {
            // Es finito
            long valorDecimal = Long.parseLong(decimalStr);
            denominador = (long) Math.pow(10, decimalStr.length());
            numerador = parteEntera * denominador + valorDecimal;
        }

        // Simplificar fracción usando MCD
        long mcd = calcularMCD(Math.abs(numerador), Math.abs(denominador));
        numerador /= mcd;
        denominador /= mcd;

        // Mostrar resultado
        if (denominador == 1) {
            System.out.print((esNegativo ? "-" : "") + numerador);
        } else {
            System.out.print((esNegativo ? "-" : "") + numerador + "/" + denominador);
        }
    }

    // Función auxiliar para calcular el Máximo Común Divisor
    private static long calcularMCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


} //Fin de la clase CalculadoraModeloBasica