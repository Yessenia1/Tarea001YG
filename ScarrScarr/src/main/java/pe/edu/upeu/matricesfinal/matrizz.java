package main.java.pe.edu.upeu.matricesfinal;
import java.util.Scanner;

public class matrizz {
    public void transformada21() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor=cs.nextInt();            
        String[][] matriz=new String[dimension][dimension];   
        for (int c = matriz[0].length; c >=0 ; c++) {
            for (int f =0 ; f < matriz.length-((dimension-1)-c); f--) {               
                matriz[f][c]=String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void transformada25() {
        String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int fila = 0; fila < matriz.length; fila++) {
        if(fila%2==0){
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
           }
        }else{
            for (int columna = matriz.length-1; columna >=0; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
       imprimirMatriz(matriz);
    }
    public void transformada26() {
        String[][] matriz;
    System.out.println("Ingrese la dimension de la Matriz:");
    int dimension=cs.nextInt();
    System.out.println("");
    int valor=0;
    matriz=new String[dimension][dimension];
    for ( int fila = 0; fila < matriz.length; fila++) {
        if(fila%2==0){
            for (int columna = matriz.length-1; columna >=0; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
            }else{
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
    imprimirMatriz(matriz);
}
    public void transformada23() {
        String[][] matriz;
    System.out.println("Ingrese la dimension de la Matriz:");
    int dimension=cs.nextInt();
    System.out.println("");
    int valor=0;
    matriz=new String[dimension][dimension];
    for ( int columna = 0; columna < matriz.length; columna++) {
        if(columna%2==0){
            for (int fila = matriz.length-1; fila >=0; fila--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
            }else{
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
    imprimirMatriz(matriz);
    }
    public void transformada27() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor =0;
        String[][] matriz = new String[dimension][dimension];
        for (int fila =matriz.length - 1; fila >= 0; fila--) {
            if (fila % 2 == 0) {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor=valor+1;
                }
            } else {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] =String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
    }
    public void transformada22() {
        String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int columna = 0; columna < matriz[0].length; columna++) {
        if(columna%2==0){
            for (int fila = matriz.length-1; fila >= 0; fila--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
           }
        }else{
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
       imprimirMatriz(matriz);
    }
    public void transformada28() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = matriz.length - 1; fila >= 0; fila--) {
            if (fila%2==0) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor=valor+1;
                }
            } else {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] =String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
    }
    public void transformada20() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = matriz[0].length - 1; fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor=valor+1;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void transformada19() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor=valor+1;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void transformada24() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int columna = matriz[0].length - 1; columna >= 0; columna--) {
            if (columna%2== 0) {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor+1;
                }
            } else {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor+1;
                }
            }

        }
        imprimirMatriz(matriz);
}
public void transformada12() {
    String[][] matriz;
    System.out.println("Ingrese dimesion de Matriz:");
    int dimension = cs.nextInt();
    int valor = 0;
    matriz = new String[dimension][dimension];
    for (int fila = 0; fila < matriz.length; fila++) {
        for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
            matriz[fila][columna]=String.valueOf(valor);
            valor=valor+1;
        }          
    }
    imprimirMatriz(matriz);
}
        public void imprimirMatriz(String[][] m) {
            for (int f = 0; f < m.length; f++) {
                for (int c = 0; c < m[0].length; c++) {
                    if(m[f][c]==null){
                        System.out.print("\t");
                    }else{
                        System.out.print(m[f][c]+"\t");
                    }
                }
                System.out.println("");
            }
        }
    
        public static void main(String[] args) {
            //new Transformadas().transformada01();
            new matrizz().transformada21();
     }
    
}


