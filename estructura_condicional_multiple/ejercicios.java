package estructura_condicional_multiple;

import java.util.Scanner;

public class ejercicios {
    public void profesor() {
        System.out.println("Enseñar");
        
    }
    public void alumno() {
        System.out.println("entudiar o aprender");
        
    }
    public static void maquinaPC() {
    System.out.println("procesa información");
        
    }
    public static void proyector () {
        System.out.println("proyecta img                 ");
        
    }
    
    public static void main(String[] args) {
        ejercicios obj=new ejercicios();
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el numero de algoritmo:\n2=alumno"+
        "\n3=maquinaPC\n4=proyector");
        int opcionesMet=lt.nextInt();
        switch (opcionesMet) {
            case 1:
                obj.profesor();
                break;
            case 2:
               obj.alumno();
               break;
            case 3:
               obj.maquinaPC();
            case 4:
              obj.proyector();
            default:System.err.println("Esa opción no existe");
                break;
        }
    }
}
