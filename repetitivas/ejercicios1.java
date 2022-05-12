import java.util.Scanner;

/**
 * ejercicios1
 */
public class ejercicios1 {
    

    
        public static void whiile() {
            int numInit=1;
            while (numInit<=20){
                System.out.println(numInit);
                numInit=numInit+1;

            
            }
        
        }
        public static void dowhile() {
            int numInit=1;
            do{
                System.out.println(numInit);
                numInit++;
            }while (numInit<=20);
            
        }
        public static void forw() {
            
            for (int numInit=1; numInit<=20; numInit=numInit++) {
                System.out.println(numInit);
                
              }
            
        }
        public static void nombref() {
            Scanner lt=new Scanner(System.in);
            System.out.println("ingrese su nombre");
            String nombre=lt.next();
            
            for (int i = nombre.length()-1; i >=0; i--) {
                
                System.out.println(nombre.charAt(i));
            }
           
        
            
        }
    public static void main(String[] args) {  
        /*System.out.println("imprime while: "); whiile();
        System.out.println("imprime do while"); dowhile();
        System.out.println("imprimir for"); forw();*/
        nombref();
    }
}