/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetaxo;

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
public class ConversorJunitTest {
    
    public ConversorJunitTest() {
    }
    
   

    
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ConversorJunit.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testCAf() {
        System.out.println("cAf");
        double c = 50;
        double expResult = 122;///////////////////////////////////////////////////////////////mal
        double result = ConversorJunit.cAf(c);
        assertEquals(expResult, result, 0.0);
      
        fail("The test case is a prototype.");
    }

    /**
     * Test of desci method, of class ConversorJunit.
     */
    @Test
    public void testDesci() {
        System.out.println("desci");
        int expResult = 0;
        int result = ConversorJunit.desci();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dato method, of class ConversorJunit.
     */
    @Test
    public void testDato() {
        System.out.println("dato");
        double expResult = 0.0;
        double result = ConversorJunit.dato();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
