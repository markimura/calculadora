/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testDiv() {
        System.out.println("div");
        int x = 0;
        int y = 0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.div(4, 0);
        assertEquals(3, result, 0.0);
        
    }
}
