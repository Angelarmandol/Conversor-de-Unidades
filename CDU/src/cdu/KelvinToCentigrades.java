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
public class KelvinToCentigrades implements ConvertionMethodInterface  {
    
    public double method(double value){
        System.out.println(value + " Centigrados a Kelvin");
      double cent= value-273.15;
      return cent;
      
    }
    
}
