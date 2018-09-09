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
public class CentToKelvin implements ConvertionMethodInterface {

     

    @Override
    public double method(double value) {
      System.out.print(value + " Centigrados a Kelvin: ");
      double kelvin=(value+273.15);
      return kelvin;
    }

    
    
    
}
