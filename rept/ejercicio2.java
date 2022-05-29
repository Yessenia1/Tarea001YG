package rept;
import java.util.Scanner;

public class ejercicio2{
    /*4.2.	Bembos ofrece hamburguesas sencillas (S), dobles (D) y triples (T), las cuales tienen un costo de S/ 10, S/ 12 y S/ 14 respectivamente. 
    La empresa acepta tarjetas de crédito con un cargo de 5 % sobre la compra. 
    Suponiendo que los clientes adquieren N hamburguesas, las cuales pueden ser de diferente tipo, realice un algoritmo para determinar cuánto deben pagar. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  a;
        double resu;
        String tipo;
        String S;
        String tc;
        double resu1;
        System.out.println("que tipos de hamgurguesas deseas, Bembos ofrece hamburguesas sencillas (S), dobles (D) y triples (T): ");
        tipo = in.next(); 
        if(tipo=="S"){
            System.out.println("cuantas hamburguesas deseas: ");
            a = in.nextInt();
            resu= 10*a;
            System.out.println("cuenta con tarjeta de credito si/no: ");
          if(tc=="si"){
              resu1=resu-(resu*0.5);
              System.out.print("el costo con tu tarjeta de credito es de :_"+ resu1);
          } else if(ts=="no"){
            resu1 = resu;  
          }
            
        }
        


        
    }
}


