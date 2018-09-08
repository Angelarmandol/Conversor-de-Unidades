/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ANGEL
 */
public class Read {

    public static double valueRead(){
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
