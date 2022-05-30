package rept;
import java.util.Scanner;

public class ejercicio47_YA_Gutierrez_Anco {
    static Scanner lt=new Scanner(System.in);
    //4.7.	Realice el algoritmo para determinar cuánto pagará una persona que adquiere N artículos,
    // los cuales están de promoción. Considere que, 
    //si su precio es mayor o igual a S/ 200 se le aplica un descuento de 15%, 
    //y si su precio es mayor a S/ 100 pero menor a S/200, el descuento es de 12%;
    // de lo contrario, sólo se le aplica 10%. Se debe saber cuál es el costo 
    //y el descuento que tendrá cada uno de los artículos y finalmente cuánto se pagará por todos los artículos obtenidos. 
    //Represente la solución mediante el diagrama de lujo, el pseudocódigo y el diagrama N/S. 
    
    public static void main(String[] args){
        int x;
        float n;
        double d;
        float p;
        System.out.print("¿Cuantos articulos compro? ");
        x=lt.nextInt();
        for(int i=1; i<=x; i++){
            System.out.print("cuanto es el costo del articulo: ");
            n=lt.nextFloat();
            if(n>=200){
              p= 15;
              d = n-(n*(0.15));
              System.out.println("El descuento del articulo: "+p);
              System.out.println("%");
              System.out.println("El costo total: "+d);

            }else if(n>100 && n<200){
              d = n-(n*(0.12));
              p = 12;
              System.out.print("El descuento del articulo: "+p);
              System.out.println("%");
              System.out.println("El costo total: "+d);

            }else if(n<=100){
              d = n-(n*(0.10));
              p=10;
              System.out.print("El descuento del articulo: "+p);
              System.out.println("%");
              System.out.println("El costo total: "+d);
            }
            
        }
        
        
    }
    


}
