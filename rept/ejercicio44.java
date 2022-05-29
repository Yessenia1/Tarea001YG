package rept;
import java.util.Scanner;

public class ejercicio44 {
    static Scanner lt=new Scanner(System.in);

    public static void main(String[] args) {
        int v=0;
        int b=0;
        int r=0;
        String n;
        int suma;
        
        
        for(int i=1; i<=3; i++){
            System.out.print("¿cuantos focos (verde, blanco y rojo) hay?");
            n = lt.nextLine();
            if("verde".equals(n)){
                System.out.print("cantidad de focos verdes");
                v=lt.nextInt();
            }else if("blanco".equals(n)){
                System.out.print("cantidad de focos blancos");
                b=lt.nextInt();
            }else if("rojo".equals(n)){
                System.out.print("cantidad de focos rojos");
                r=lt.nextInt();
                suma=v+b+r;
            }
            

        
        }
        System.out.print("La cantidad total"+ suma);

    }
}
