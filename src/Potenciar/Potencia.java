
package Potenciar;
import java.util.Scanner;

public class Potencia {
    

    
    public static void main(String [] args){
    int base;
    int n;
    Scanner sc= new Scanner(System.in);
    System.out.println("introduzca la base ");
    base=sc.nextInt();
    System.out.println("ahora introduzca el exponente");
    n=sc.nextInt();
    int resultado= (int)Math.pow(base, n);
    System.out.println(base+" elevado a la "+n+ " es igual a... "+resultado  );
    System.out.println("este es el segundo cambio");
    }
}

