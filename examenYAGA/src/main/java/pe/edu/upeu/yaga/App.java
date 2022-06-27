package pe.edu.upeu.yaga;

import java.util.Scanner;

import pe.edu.upeu.yaga.examen.resolucionexamyaga;

public class App 
{
    public static void main( String[] args )
    {
        Scanner lt=new Scanner(System.in);
        int n;
        System.out.println("Ingrese el numero de la pregunta(2-5):");
        n=lt.nextInt();
        switch (n) {
            case 2: new resolucionexamyaga().examen2(); break;
            case 3: new resolucionexamyaga().examen3(); break;
            case 4: new resolucionexamyaga().examen4(); break;
            case 5: new resolucionexamyaga().examen5(); break;
            default: System.err.println("error 4"); break;
        }
    }

}

