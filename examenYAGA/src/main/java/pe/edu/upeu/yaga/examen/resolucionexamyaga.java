package pe.edu.upeu.yaga.examen;
import java.util.Scanner;

public class resolucionexamyaga {
    Scanner lt=new Scanner(System.in);

    public void examen2() {
        int i;
        int n = 3;
        double c1;
        double c2;
        double c3;
        double r;
        double costo;
        double impuesto, impuestox;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        impuestox = 0;
    
        System.out.print("¿cuantos autos tiene? ");
        n = lt.nextInt();
    
        for (i = 1; i <= n; i++) {
            
            System.out.println("categoria (1,2,3) ");
            r = lt.nextDouble();
            lt.nextLine();

            System.out.print("Ingresa el costo del auto: ");
            costo = lt.nextDouble();
            lt.nextLine();

            impuesto = 0;
            if (r == 1) {
                impuesto = costo * 0.12;
                c1 = c1 + impuesto;
            }
            if (r == 2) {
                impuesto = costo * 0.08;
                c2 = c2 + impuesto;
            }
            if (r == 3) {
                impuesto = costo * 0.05;
                c3 = c3 + impuesto;
            }
            impuestox = impuestox + impuesto;
            System.out.println("impuesto total: " + impuesto);
        }
        System.out.println("total categoria 1: " + c1);
        System.out.println("total categoria 2: " + c2);
        System.out.println("total categoria 3: " + c3);
        System.out.println("total de impuesto: " + impuestox);
    }

    public void examen3() {
        
        int n;
        System.out.print("ingrese la altura (X): ");
        n = lt.nextInt();
        if (n >= 3 && n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j || i + j == n + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();

            }
        } else {
            System.out.println("error (╯︵╰)");
        }
    }

    public void examen4() {
        int i;
        int j;
        int suma;
        int a = 0;
        System.out.println("Ingrese la cantidad de numeros perfectos: ");
        int r = lt.nextInt();
        System.out.println("numero perfectos son: ");
        for (i = 1; i > 0; i++) {

            suma = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {
                a++;
                if (a <= r) {
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }
    }

    public void examen5() {
        int n;
        do {
            System.out.print("introduzca un numero (72): ");
            n = lt.nextInt();
        } while (n < 0);
        cinco(n);
    }
    public static void cinco(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            cinco(n / 2);
            System.out.print(n % 2);
            return;
        }
    
    }


}


