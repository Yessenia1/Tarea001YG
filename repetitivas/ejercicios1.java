/**
 * ejercicios1
 */
public class ejercicios1 {

    
        public static void whiile() {
            int numInit=21;
            while (numInit<=20){
                System.out.println(numInit);
                numInit=numInit+1;

            
            }
        
        }
        public static void dowhile() {
            int numInit=21;
            do{
                System.out.println(numInit);
                numInit++;
            }while (numInit<=20);
            
        }

    public static void main(String[] args) {  
        System.out.println("imprime while: "); whiile();
        System.out.println("imprime do while"); dowhile();
    }
}