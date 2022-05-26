
public class c{
public static void main(String[] args) {

        
for (int i = 1; i <= 6; i++) {

            for (int j = 1; j < 7 - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {

                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}