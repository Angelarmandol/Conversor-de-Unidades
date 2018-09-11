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

    @Override
    public String menu() {
      return "Kelvin a Farenheit";
    }
    
}
