package org.example;

public class MainPrueba_Lombok {
    public static void main(String[] args){

        try{

            Prueba_Lombok pruebaLombok1 = new Prueba_Lombok(1,"aaaa", 12345);

            System.out.println("Contraseña de 'prueba1': " + pruebaLombok1.getContrasena());

        } catch (Exception e){
            System.out.println(e);
        }


    } //Fin del main
}
