/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANGEL
 */
public class CentsToFarenheitTest {
    
    
    @Test
    public void testMethod() {
        System.out.println("method");
        double value = 10;
        CentsToFarenheit instance = new CentsToFarenheit();
        double expResult = 50;
        double result = instance.method(value);
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of menu method, of class CentsToFarenheit.
     */
 
    
}
