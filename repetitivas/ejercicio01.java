package repetitivas;

import java.util.Scanner;

public class ejercicio01 {
  
    static Scanner lt=new Scanner(System.in);

    public static void suma10() {
        //Definir variables
        int contador=1;
        double numeroX;
        double sumaNumeros=0;
        //Proceso Datos de entrada
        while (contador<=10) {
            System.out.print("Ingrese el valor de "+contador+": ");
            numeroX=lt.nextDouble();
            sumaNumeros=sumaNumeros+numeroX;
            contador++;
            System.out.println("");
        }
        //Datos de Salida
        System.out.println("La suma de los "+(contador-1)+" valores introducidos es: "+ sumaNumeros);
    }
    public static void suma10dw(){
        int contador=1;
        double numeroX;
        double suma=0;
        do{

        }while()

    }


    public static void main(String[] args) {
        suma10();
    }

}