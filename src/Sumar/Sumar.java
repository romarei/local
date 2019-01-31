
package Sumar;
import java.util.Scanner;

public class Sumar {
   int a;
   int b;
   Sumar(int a,int b){
   this.a=a;
   this.b=b;
   }
   public int suma(){
   int resultado;
   resultado=a+b;
   return resultado;
   }
           
     public static void main(String [] args){
    int a;
    int b;
    Scanner sc= new Scanner(System.in);
    System.out.println("introduzca el valor del primer numero");
    a=sc.nextInt();
    System.out.println("ahora introduzca el segundo numero");
    b=sc.nextInt();
    Sumar operacion=new Sumar(a,b);
    System.out.println("el resultado es "+ operacion.suma() );
    }
}
