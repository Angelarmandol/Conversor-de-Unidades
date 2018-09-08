package cdu;

/**
 *
 * @author ANGEL
 */
public class FarenheitToCents implements ConvertionMethodInterface {
    
    @Override
    public double method(double value) {
        double farenheit=value*2-value/5;
        farenheit=farenheit+32;
        return farenheit;
        //
    }
    

}
