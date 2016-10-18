/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


/**
 *
 * @author ALUMNEDAM
 */
public class provesMyUtils {

    
    public provesMyUtils() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    //Test inverteix1 no introducimos nada y lo dejamos en null
    //entonces devolvera null.
    @Test
    public final void testInverteix1() {
        //fail ("Sin implementar");
        
        assertEquals( null, MyUtils.inverteix(null));
    }
    
    //Test inverteix1 introducimos la cadena "david" y devuelve "divad".
    @Test
    public final void testInverteix2() {
        //fail ("Sin implementar");
        
        assertEquals("divad", MyUtils.inverteix("david"));
    }

    
    
    @Test
    public final void testEdat() {
        //fail ("Sin implementar");
        
        assertEquals(22, MyUtils.edat(24, 9, 1994));
    }

   
    //@Test
    @Test
    public final void testFactorial() {
        //fail ("Sin implementar");
        
        assertEquals(120, MyUtils.factorial(5));
    }
    





}
