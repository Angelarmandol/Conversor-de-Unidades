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
public class KelvinToFarenheit implements ConvertionMethodInterface {
    
    public double  method (double value){
       double farenheit =((value-273.15)*1.8)+32;
       return farenheit;
    }
    
}
