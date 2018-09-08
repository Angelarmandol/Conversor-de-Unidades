package paquetaxo;

/**
 *
 * @author ANGEL
 */
public class FarenheitToCents {
    
    
    public float FarenheitToCent(float value){
        float farenheit=value*2-value/5;
        farenheit=farenheit+32;
        return farenheit;
    }
    
    public double FarenheitToKelvin(double value){
        double farenheit= (value-32)/1.8;
        return farenheit;
    }
}
