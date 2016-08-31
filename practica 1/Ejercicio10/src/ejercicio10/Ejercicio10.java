/*
10. Leer un número de dos dígitos y determinar si pertenece a la suceción de Fibonacci.
 */
package ejercicio10;

/**
 * @author Daniela
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int f1=0, f2=1, nuevo=0, num, sw=1;
        System.out.println("Ingrese el numero entero de dos digitos");
        num=lector.nextInt();
        
        while (sw==1){
            nuevo = f1+f2;
            f1=f2;
            f2=nuevo;
            if (num==nuevo){
                System.out.println("Pertenece");
                sw=0;
            }
            else{
                if(num>nuevo){
                    sw=1;
                }
                else {
                    System.out.println("no pertenece");
                    sw=0;
                }
            }
                
                
            
                
               
                
            
            
            
        }
         
            
        
   
    }
    
}
