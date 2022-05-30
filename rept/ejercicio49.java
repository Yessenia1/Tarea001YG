package rept;
import java.util.Scanner;

public class ejercicio49 {
    static Scanner lt=new Scanner(System.in);
    //Los directivos de equis escuela requieren determinar 
    //cuál es la edad promedio de cada uno de los M salones y cuál es la edad promedio de toda la escuela. 
    //Realice un algoritmo para determinar estos promedios y represente la solución mediante un algoritmo.
    public static void main(String [] args){
        int e;
        float t;
        double r=0;
        double p;
        int s;
        double m=0;
        double n=0;
        System.out.println("cuantos salones tiene la escuela: ");
        s=lt.nextInt();
        for(int i=0; i<s; i++){
            System.out.println("cuantos alumnos tiene la clase; ");
            t=lt.nextInt();
            for(int j=0; j<t; j++){
                System.out.println("Cual es su edad");
                e=lt.nextInt();
                r=r+e;
            }
            p=r/t;
            System.out.println("el promedio de la clase es"+p);
            
            n=m/(t)*s;
        }
        m=m+s;
        
        System.out.println("el promedio de la escuela es"+n);
        
        
    }
}

