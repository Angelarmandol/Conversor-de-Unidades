package cdu;

/**
 *
 * @author ANGEL
 */
public class KelvinToCentigrades implements ConvertionMethodInterface  {
    
    
    public double method(double value){
      double cent= value-273.15;
      return cent;
      
    }

    @Override
    public String menu() {
      return "Kelvin a Centigrados";
    }
    
}
