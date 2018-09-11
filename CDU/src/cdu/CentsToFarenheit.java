package cdu;

/**
 *
 * @author ANGEL
 */
public class CentsToFarenheit implements ConvertionMethodInterface {

  
     
    @Override
    public double method(double value) {    
        double cent= (value*9/5)+32;
        return cent;
    }

    @Override
    public String menu() {
        return "Centigrados a Farenheit";
    }
    
    
  
 
    
}
