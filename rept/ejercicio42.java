package rept;
import java.util.Scanner;


    public class ejercicio42{
      static Scanner lt = new Scanner(System.in);
        /*4.2.	Bembos ofrece hamburguesas sencillas (S), dobles (D) y triples (T), las cuales tienen un costo de S/ 10, S/ 12 y S/ 14 respectivamente. 
        La empresa acepta tarjetas de crédito con un cargo de 5 % sobre la compra. 
        Suponiendo que los clientes adquieren N hamburguesas, las cuales pueden ser de diferente tipo, realice un algoritmo para determinar cuánto deben pagar. */
        public static void main(String[] args) {
            int  a;
            int x;
            double resu;
            String tipo;
            String S= "";
            String D= "";
            String T= "";
            String tg= "";
            double resu1;
            System.out.print("Cuantas hamburguesas desea comprar: ");
            x=lt.nextInt();
            for(int i=1; i<=x; i++){
              System.out.println("que tipos de hamgurguesas deseas, Bembos ofrece hamburguesas sencillas (S), dobles (D) y triples (T): ");
            tipo=lt.nextLine();
            if("S".equals(tipo)){
                System.out.println("cuantas hamburguesas deseas: ");
                a = lt.nextInt();
                resu= 10*a;
                System.out.println("cuenta con tarjeta de credito si/no: ");
                tg = lt.next();
              if("si".equals(tg)){
                  resu1=resu-(resu*0.5);
                  System.out.println("el costo con tu tarjeta de credito es de :_"+ resu1);
              } else if("no".equals(tg)){
                resu1 = resu;  
                System.out.println("el costo de sus hamburguesas es :"+ resu1);
              }
                
            }
            if("D".equals(tipo)){
                System.out.println("cuantas hamburguesas deseas: ");
                a = lt.nextInt();
                resu= 12*a;
                System.out.println("cuenta con tarjeta de credito si/no: ");
                tg = lt.next();
              if("si".equals(tg)){
                  resu1=resu-(resu*0.5);
                  System.out.print("el costo con tu tarjeta de credito es de :_"+ resu1);
              } else if("no".equals(tg)){
                resu1 = resu;  
                System.out.println("el costo de sus hamburguesas es :"+ resu1);
              }
            }
    
              if("T".equals(tipo)){
                System.out.println("cuantas hamburguesas deseas: ");
                a = lt.nextInt();
                resu= 14*a;
                System.out.println("cuenta con tarjeta de credito si/no: ");
                tg = lt.next();
              if("si".equals(tg)){
                  resu1=resu-(resu*0.5);
                  System.out.print("el costo con tu tarjeta de credito es de :_"+ resu1);
              } else if("no".equals(tg)){
                resu1 = resu;
                System.out.println("el costo de sus hamburguesas es :"+ resu1);  
              }else{}
            }
            }
            
            
        }
    }