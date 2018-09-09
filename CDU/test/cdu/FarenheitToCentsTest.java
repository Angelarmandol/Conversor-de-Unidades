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
public class FarenheitToCentsTest {
    
     
    /**
     * Test of method method, of class FarenheitToCents.
     */
    @Test
    public void testMethod() {
        System.out.println("method");
        double value = 10;
        FarenheitToCents instance = new FarenheitToCents();
        double expResult = -12.2;
        double result = instance.method(value);
        assertEquals(expResult, result, 0.2);
        // TODO review the generated test code and remove the default call to fail.
       
    }


}
