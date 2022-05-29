package rept;
import java.util.Scanner;

public class ejercicio48 {
    static Scanner lt=new Scanner(System.in)
    //4.8.	Un cliente de un banco deposita equis cantidad de soles cada mes en una cuenta de ahorros. 
    //La cuenta percibe un interés fijo durante un año de 10 % anual. 
    //Realice un algoritmo para determinar el total de la inversión final de cada año en los próximos N años. 
    //Represente la solución mediante el diagrama de flujo, el pseudocódigo y diagrama N/S.

    public static void main(String [] args){
        float d;
        int m;
        double i;
        System.out.print("cantidad de dinero en la cuenta de ahorro por mes")
        d=lt.nextFloat();
        System.out.println("cuantos meses va depositando");
        m=lt.nextInt();
        if(m>=12){
            i=d+(d*0.10)*m;
        }else if(m<12){
            i=d;
        }
    }
}
