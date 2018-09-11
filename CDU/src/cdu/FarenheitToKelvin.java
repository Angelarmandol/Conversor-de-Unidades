package cdu;

/**
 *
 * @author ANGEL
 */
public class FarenheitToKelvin implements ConvertionMethodInterface {
    
   
    @Override
    public double method(double value) {
        System.out.println(value + " Farenheit a Kelvin");
        double kelvin=((value-32)/1.8)+273.15;
        return kelvin;
    }

    @Override
    public String menu() {
        return "Centigrados a Kelvin";
    }
      
}
