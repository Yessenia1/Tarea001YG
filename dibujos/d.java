import java.util.Scanner;
 
public class d {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        System.out.println("ingrese el numero filas del cuadrado ");
        int d=leerT.nextInt();
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <d; i++) {
            
            for (int j = 0; j < d; j++) {
                System.out.print("   *");
            }
            System.out.print("\n");
        
            
        
    }
    }
}public class d {
    
}
