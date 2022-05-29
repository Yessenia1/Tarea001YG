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
        int x;

            for(int i=0; i<=4; i++){
                System.out.print("Introducir el color del foco: rojo, blanco y verde en orden: ");
                n = lt.nextLine();
                if("verde".equals(n)){
                  System.out.print("cantidad de focos verdes: ");
                  v=lt.nextInt();
                  
                }else if("blanco".equals(n)){
                  System.out.print("cantidad de focos blancos: ");
                  b=lt.nextInt();
                  
                }else if("rojo".equals(n)){
                  System.out.print("cantidad de focos rojos: ");
                  r=lt.nextInt();
                
                }
                suma=r+b+v;
                System.out.println("La suma total es " + suma);
            }
        
            
        
        }
        

}
