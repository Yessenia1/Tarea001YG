package pe.edu.upeu.matricess;
import java.util.Scanner;

public class matri {
    Scanner cs=new Scanner(System.in);
    public void transformada21() {
        String[][] matriz;
        System.out.println("Ingrese la dimension de la Matriz:");
        int dimension=cs.nextInt();//5
        System.out.println("");
        int valor=0;
        matriz=new String[dimension][dimension];
        for (int columna = 0; columna < matriz[0].length; columna++) {
            if(columna%2==0){
                 for (int fila = 0; fila < matriz.length; fila++) {
                     matriz[fila][columna]=String.valueOf(valor);
                     valor=valor+1;
                 }
            }else{
                for (int fila = matriz.length-1; fila >= 0; fila--) {
                     matriz[fila][columna]=String.valueOf(valor);
                     valor=valor+1;
                }
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
        new matri().transformada21();
    }
    
}