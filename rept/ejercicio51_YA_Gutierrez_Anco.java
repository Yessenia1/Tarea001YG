package rept;
import java.util.Scanner;

public class ejercicio51_YA_Gutierrez_Anco {
    static Scanner lt = new Scanner(System.in);
    //4.11.	Se desea saber el total de una caja registradora de un almacén, 
    //se conoce el número de billetes y monedas, así como su valor. 
    //Realice un algoritmo para determinar el total. Represente la solución mediante un algoritmo.
    public static void main(String[] args) {
        float m;
        float b;
        float v;
        double r;
            System.out.println("cuantas monedas hay");
            m = lt.nextFloat();
            System.out.println("cuanto vale cada una");
            v = lt.nextFloat();
            System.out.println("cuantos billetes  hay");
            b = lt.nextFloat();
            System.out.println("cuanto vale cada una");
            v = lt.nextFloat();
            r=(b*v)+(m*v);
            System.out.println("el total es: "+r);
            
        }
        
        
    
 }


