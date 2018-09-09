package cdu;

/**
 *
 * @author ANGEL
 */
public class FarenheitToCents implements ConvertionMethodInterface {
    
 
    @Override
    public double method(double value) {
        double celcius=(value-32)/1.8;
        return celcius;
        //
    }

    @Override
    public String menu() {
        return "Farenheit a Centigrados";
    }
    

}
