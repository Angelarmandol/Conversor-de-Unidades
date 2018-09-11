package cdu;

/**
 *
 * @author ANGEL
 */
public class CentToKelvin implements ConvertionMethodInterface {
       

    @Override
    public double method(double value) {
      double kelvin=(value+273.15);
      return kelvin;
    }

    @Override
    public String menu() {
         return "Centigrados a Kelvin";
    }

    
    
    
}
