package rept;
import java.util.Scanner;

public class ejercicio43 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        float n;
        int a;
        int contador=0;
        int contador1=0;
        int contador2=0;
        System.out.print("Cuantos numeros desea ingresar: ");
        x=lt.nextInt();
        for(int i=1; i<=x; i++){
            System.out.print("Ingrese un numero: ");
            n=lt.nextFloat();
            if(n==0){
                contador++;
            }else if(n<0){
                contador1++;
            }else if(n>0){
                contador2++;
            }
        }
    System.out.println("numeros iguales a cero: "+ contador);  
    System.out.println("numeros menores a cero: "+ contador1);
    System.out.println("numeros mayores a cero: "+contador2);
        

    }
}
