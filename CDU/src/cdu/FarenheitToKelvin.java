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
public class FarenheitToKelvin implements ConvertionMethodInterface {
    
   
    @Override
    public double method(double value) {
        System.out.println(value + " Farenheit a Kelvin");
        double kelvin=((value-32)/1.8)+32;
        return kelvin;
    }

    @Override
    public String menu() {
        return "Centigrados a Kelvin";
    }
      
}
