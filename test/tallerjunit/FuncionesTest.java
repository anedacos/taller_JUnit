/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjunit;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piero512
 */
public class FuncionesTest {
    
    public FuncionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of factorial method, of class Funciones.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int number = 5;
        int expResult = 120;
        int result = Funciones.factorial(number);
        assertTrue(expResult==result);
        int number2 = -1;
        try{
            Funciones.factorial(number2);
            fail("No se disparó la excepción de número negativo.");
        } catch(UnsupportedOperationException e){
            
        }
        
    }
    
    
     
    @Test
    public void isSameReferenceTest(){
         
        Funciones msnt = new Funciones();
        assertNotSame(msnt.getPropValue("key1"), msnt.getPropValue("key2"));
    }
    
}
