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
public class CentToKelvinTest {
    


    /**
     * Test of method method, of class CentToKelvin.
     */
    @Test
    public void testMethod() {
        System.out.println("method");
        double value = 10;
        CentToKelvin instance = new CentToKelvin();
        double expResult = 283.15;
        double result = instance.method(value);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of menu method, of class CentToKelvin.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        CentToKelvin instance = new CentToKelvin();
        String expResult = "Centigrados a Kelvin";
        String result = instance.menu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
