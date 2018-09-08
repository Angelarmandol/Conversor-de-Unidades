
package cdu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ANGEL
 */
public class ConversorJunit {

 
    /**
     * @param args the command line arguments
     */
      

    public static void main(String[] args) { 

      boolean permanecer = true;
  
        while (permanecer){
        
       
           
           switch(desci()){
               case 1:
                   System.out.println("1.- Centigrados a Farenheit");
            
               break;
               
               case 7:
                   permanecer=false;
               break;
               
              
           }
          
               
        
            
        }// fin while
        
        
       
    }// fin main
    
    
   
    public static int desci(){
             
    BufferedReader tlc=new BufferedReader(new InputStreamReader(System.in)); 
            int decision=0;
            System.out.println("Seleccione una opcion:");
            System.out.println("1.- Centigrados a Farenheit");
            System.out.println("2.- Centigrados a Kelvin");
            System.out.println("2.- Farenheit a Centigrados");//
            System.out.println("4.- Farenheit a Kelvin");
            System.out.println("5.- Kelvin a Centigrados");
            System.out.println("6.- Kelvin a Farenheit");
            System.out.println("7.- Salir");
       
        try {
            decision = Integer.parseInt(tlc.readLine());
        } catch (IOException ex) {
           System.out.println("Dato no valido");
        }
        
        if (decision>7 || decision==0){
            System.err.println("fuera de rango");
            decision=0;
        }
        
        return decision;
    }

    
    public static double dato(){
        double a =0.0;
        BufferedReader tlc=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Ingresa dato a:");
        try {
             a = Double.parseDouble(tlc.readLine());
        } catch (IOException ex) {
            Logger.getLogger(ConversorJunit.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        return a;
      
    }
    
    
     
    
}
