package rept;


public class ejercicio45_YA_Gutierrez_Anco {
    //4.1.	Un profesor tiene un salario inicial de S/ 1500, 
    //y recibe un incremento de 10 % anual durante 6 años. ¿Cuál es su salario al cabo de 6 años? 
    //¿Qué salario ha recibido en cada uno de los 6 años? 
    //Realice el algoritmo utilizando el ciclo apropiado.
    public static void main(String [] args){
        //por for
        int salario = 1500;
        double r =0;
        for(int i =0; i<=6;i++){
          r = salario+(salario*0.10)*i;
          System.out.print("el salario al cabo de "+i);
          System.out.println(" años es "+r);
        }

        //por while
        int salario1 =1500;
        double r1=0;
        int i =0;
        while (i <= 6) {
            r1 = salario1+(salario1*0.10)*i;
            System.out.print("el salario al cabo de "+i);
            System.out.println(" años es "+r1);
            i++;
        }

        //do while
        int salario2 =1500;
        double r2=0;
        i=0;
        
        do {
            r2 = salario2+(salario2*0.10)*i;
            System.out.print("el salario al cabo de "+i);
            System.out.println(" años es "+r2);
           i++;
        }
        while (i <= 6);
        
    }
}
