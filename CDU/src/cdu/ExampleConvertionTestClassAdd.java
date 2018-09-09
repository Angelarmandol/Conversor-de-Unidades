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
public class ExampleConvertionTestClassAdd implements ConvertionMethodInterface {

    @Override
    public String menu() {
      return "Test menu +10";
    }

    @Override
    public double method(double value) {
       return value+10;
    }
    
}
