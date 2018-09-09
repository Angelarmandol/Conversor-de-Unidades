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
public class ConversorMain {

    static ConvertionMethodInterface[] ConvertMethods = {
        new CentsToFarenheit(),
        new CentToKelvin(),
        new FarenheitToCents(),
        new FarenheitToKelvin(),
        new KelvinToCentigrades(),
        new KelvinToFarenheit()
    };

    public static void main(String[] args) {

        boolean permanecer = true;

        while (permanecer) {

            int eletion = desci();
            if (eletion == ConvertMethods.length + 1) {
                permanecer = false;
            } else if (eletion > ConvertMethods.length || eletion == 0) {
                System.out.println("Eleccion no valida");
                eletion = 0;
            } else {
                double value = Read.valueRead();
                System.out.println("\n" + value + " " + ConvertMethods[eletion - 1].menu() + ": " + ConvertMethods[eletion - 1].method(value) + "\n");

            }

        }// fin while
        System.out.println("Adiòs");
    }// fin main

    public static int desci() {
        
        
        System.out.println("Menu");
        for (int x = 0; x < ConvertMethods.length; x++) {
            System.out.println(x + 1 + ".-" + ConvertMethods[x].menu());
        }
        
        
        try {
           System.out.println((ConvertMethods.length + 1) + "-Salir");
         
        } catch (Exception e) {
            System.out.println("DAto no valido");
   
        }
    return (int) Read.valueRead(); 
       
    }
    
    
}
