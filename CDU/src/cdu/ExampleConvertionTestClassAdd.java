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
