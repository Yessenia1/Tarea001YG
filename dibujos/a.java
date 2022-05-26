package dibujo;
import java.util.Scanner;

public class a {
    static Scanner leerT=new Scanner(System.in);

    public static void aaa() {
        System.out.println("ingrese la altura de la letra");
        int a=leerT.nextInt();
        System.out.println("ingrese el numero de fila ");
        int b=leerT.nextInt();
        int medio=a+1;
        for (int f = 1; f <= a; f++) {
            for (int c = 0; c <= 2*a+1; c++) {
                if(f==1 && medio==c){
                    System.out.print("*");
                }else if (c==medio-f && f>1){
                    System.out.print("*");
                }else if (c==medio+f && f>1){
                    System.out.print("*");
                }else if (f==a && c>=medio-f && c<=medio+f){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
        
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        aaa();
    }
}

