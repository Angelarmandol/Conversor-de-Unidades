/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu;

/**
 *
 * @author ANGEL
 */
public class FarenheitToKelvin {
    
    public double FarToKelvin(double value){
        double kelvin=((value-32)/1.8)+32;
        return kelvin;
    }
    
    
}
