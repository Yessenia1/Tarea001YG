package rept;

public class ejercicio41_YA_Gutierrez_Anco {
    //4.1.	Un profesor tiene un salario inicial de S/ 1500, y recibe un incremento de 10 % anual durante 6 años. 
    //¿Cuál es su salario al cabo de 6 años? ¿Qué salario ha recibido en cada uno de los 6 años? Realice el algoritmo utilizando el ciclo apropiado.
    
    public static void main(String[] args) {
        int salario = 1500;
        double r =0;
        for(int i =0; i<=6;i++){
          r = salario+(salario*0.10)*i;
          System.out.print("el salario al cabo de "+i);
          System.out.println(" años es "+r);
        }

       
        
    }
}
