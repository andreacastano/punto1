/*

 */
package personal_data;

/**
 *
 * @author Daniela
 */
import java.util.Scanner;
public class CLIENT extends PERSONAL_DATA{
    private double saldo;
    Scanner lector=new Scanner(System.in);
    public void saldo_cuenta(){
        
        
    }
    public void funciones(){
         System.out.println("Ingrece datos");
         PERSONAL_DATA persona1;
         persona1=new PERSONAL_DATA();
         persona1.loading_data();
         persona1.data_show();
         persona1.actualizar();
         persona1.consignacion();
         persona1.retiro();
    }
    
    
        
    }
   
    
    
    

