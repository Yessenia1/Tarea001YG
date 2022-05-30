package rept;
import java.util.Scanner;

public class ejercicio48_YA_Gutierrez_Anco {
    static Scanner lt=new Scanner(System.in);
    //4.8.	Un cliente de un banco deposita equis cantidad de soles cada mes en una cuenta de ahorros. 
    //La cuenta percibe un interés fijo durante un año de 10 % anual. 
    //Realice un algoritmo para determinar el total de la inversión final de cada año en los próximos N años. 
    //Represente la solución mediante el diagrama de flujo, el pseudocódigo y diagrama N/S.

    public static void main(String [] args){
        float d;
        int m;
        double it;
        int n;
        System.out.println("cantidad de dinero en la cuenta de ahorro por mes ");
        d=lt.nextFloat();
        System.out.println("Cuantos años quiere ahorrar ");
        n=lt.nextInt();
        System.out.println("cuantos años va depositando ");
            m=lt.nextInt();
        for(int i =0; i<=n;i++){
            if(m>=1){
                it=d+((d*0.10)*i);
                System.out.print("cantidad de ahorro por "+ i);
                System.out.println(" años es: "+it);
            }else if(m<0){
                it=d;
                System.out.println("cantidad de ahorro por años "+ it);
                System.out.println(" años es: "+it);
            }
            
        }
        
        
    }
}
