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

    static ConvertionMethodInterface[] ConvertMethods = {
        new cdu.CentsToFarenheit(),
        new cdu.CentToKelvin(),
        new cdu.FarenheitToCents(),
        new cdu.FarenheitToKelvin(),
        new cdu.KelvinToCentigrades(),
        new cdu.KelvinToFarenheit()
    };

    public static void main(String[] args) {

        boolean permanecer = true;

        while (permanecer) {

            int eletion = desci();
            if (eletion == ConvertMethods.length+1) {
                System.out.println("Adiòs");
                System.exit(0);
            } else if (eletion > ConvertMethods.length - 1 || eletion == 0) {
                System.err.println("fuera de rango");
                eletion = 0;
            } else {
                System.out.println("Entra a metodos");
                System.out.println(ConvertMethods[eletion - 1].method(Read.valueRead()));
            }

        }// fin while

    }// fin main

    public static int desci() {

        int decision = 0;
        System.out.println("Seleccione una opcion:");
        System.out.println("1.- Centigrados a Farenheit");//
        System.out.println("2.- Centigrados a Kelvin");//
        System.out.println("2.- Farenheit a Centigrados");//
        System.out.println("4.- Farenheit a Kelvin");
        System.out.println("5.- Kelvin a Centigrados");
        System.out.println("6.- Kelvin a Farenheit");
        System.out.println("7.- Salir");

        decision = (int) Read.valueRead();

        return decision;
    }

}
