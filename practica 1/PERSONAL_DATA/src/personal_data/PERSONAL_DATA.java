/*

 */
package personal_data;

/**
 * @author Daniela
 */
import java.util.Scanner;
public class PERSONAL_DATA {
    
    private String nombre;
    private String apellido;
    private String cedula; 
    private String nacimiento;
    private String direccion; 
    private String telefono;
    private String edad;
    private Scanner lector;
    private double saldo;
    private double consig, nuevosaldo=0, retirar;
    private int sw=1;
    public void loading_data(){
        lector=new Scanner(System.in);
        System.out.println("Digite nombre");
        nombre=lector.next();
        System.out.println("Digite apellido");
        apellido=lector.next();
        System.out.println("Digite numero de cedula");
        cedula=lector.next();
        System.out.println("Digite fecha de nacimiento");
        nacimiento=lector.next();
        System.out.println("Digite telefono");
        telefono=lector.next();
        System.out.println("Digite direccion");
        direccion=lector.next();
        System.out.println("Digite edad");
        edad=lector.next();
    }
    public void data_show(){
        System.out.println("el nombre es: "+nombre);
        System.out.println("el apellido es: "+apellido);
        System.out.println("La ceduta es: "+cedula);
        System.out.println("la fecha de nacimiento es: "+nacimiento);
        System.out.println("el telefono es: "+telefono);
        System.out.println("la direccion es: "+direccion);
        System.out.println("la edad es: "+edad);
        
    }
    public void actualizar(){
        PERSONAL_DATA actualizar=new PERSONAL_DATA();
        System.out.println("Desea cambiar los datos 1:SI 2:NO ");
        sw=lector.nextInt();
        while(sw==1){
            actualizar.loading_data();
            actualizar.data_show();
        System.out.println("Desea cambiar los datos 1:SI 2:NO ");
        sw=lector.nextInt();
        }
    }
        
    public void consignacion(){
        System.out.println("Digite el saldo de la cuenta: ");
        saldo=lector.nextDouble();
        System.out.println("Desea consignar dinero a su cuenta:1=SI 2=NO ");
        sw=lector.nextInt();
        
        while (sw==1){
            System.out.println("Digite el valor que desea consignar: ");
            consig=lector.nextDouble();
            nuevosaldo=saldo+consig;
            saldo=nuevosaldo;
            System.out.println("Su nuevo saldo es de : "+saldo);
            System.out.println("Desea consignar mas dinero dinero a su cuenta:1=SI 2=NO ");
            sw=lector.nextInt();   
        }
       
    }
    public void retiro(){
        System.out.println("Desea retirar dinero de su cuenta 1:SI 2:NO");
        sw=lector.nextInt(); 
        while (sw==1){
            System.out.println("Digite el valor que desea retirar: ");
            retirar=lector.nextDouble();
            nuevosaldo=saldo-retirar;
            saldo=nuevosaldo;
            System.out.println("Su nuevo saldo es de : "+saldo);
            System.out.println("Desea cretirar mas dinero dinero a su cuenta:1=SI 2=NO ");
            sw=lector.nextInt();   
        }
        
    }
    
    
}
