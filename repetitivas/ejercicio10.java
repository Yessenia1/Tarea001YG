package repetitivas;
import java.util.Scanner;

/**
 * ejercicio10
 */
public class ejercicio10 {
    static Scanner leeT=new Scanner(System.in);
    
    public static long fac(int n) {
        long r=1;
        
        if(n>1){
            for(int i=1; i<=n; i++){
                r=r*i; 
            }

        }
        return r;  
    }


    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        int n = leeT.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println("factorial de "+ i+ "es: " +fac(i));
        }
        
        
    }
}