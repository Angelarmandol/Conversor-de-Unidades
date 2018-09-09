package cdu;

import static cdu.Read.valueReadMenu;
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
        new KelvinToFarenheit(),
    
    };

    public static void main(String[] args) {

        boolean permanecer = true;

        while (permanecer) {
            int eletion = Read.valueReadMenu();

            if (eletion == ConvertMethods.length + 1) {
                permanecer = false;
            } else if (eletion > ConvertMethods.length || eletion == 0) {
                System.out.println("Eleccion no valida");
            } else {
                double value = Read.valueRead();
                if (value > 0) {
                    System.out.println("\n" + value + " " + ConvertMethods[eletion - 1].menu() + ": " + ConvertMethods[eletion - 1].method(value) + "\n");
                }

            }

        }// end while
        System.out.println("Adiós");
    }// end main

}
