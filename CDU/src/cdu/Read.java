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

    public static double valueRead() {
        double a = 0.0;
        BufferedReader tlc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa dato :");
        try {
            String text = tlc.readLine();
            text = text.trim();
            text = text.replaceAll(" ", "");
            text = text.replaceAll(",", ".");
            a = Double.parseDouble(text);

            //Validations:
        } catch (java.lang.NumberFormatException e) {
            System.err.println("No es un numero");
        } catch (IOException e) {
            System.err.println("Error de entrada de datos");
        }

        return a;
    }
    
    public static int valueReadMenu() {
        int a = 0;
        BufferedReader tlc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa dato :");
        try {
            String text = tlc.readLine();
            text = text.trim();
            text = text.replaceAll(" ", "");
            text = text.replaceAll(",", ".");
            a = Integer.parseInt(text);

            //Validations:
        } catch (java.lang.NumberFormatException e) {
            System.err.println("No es un numero");
        } catch (IOException e) {
            System.err.println("Error de entrada de datos");
        }

        return a;
    }

}
