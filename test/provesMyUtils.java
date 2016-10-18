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
    
    
  @Test
    @Ignore
    public final void testInverteix() {
        //fail ("Sin implementar");
        
        assertEquals("divad", MyUtils.inverteix("david"));
    }

    @Test
    public final void testEdat() {
        //fail ("Sin implementar");
        
        assertEquals(-1, MyUtils.edat(24, 9, 1994));
    }

   
    //@Test
    @Test
    public final void testFactorial() {
        //fail ("Sin implementar");
        
        assertEquals(120, MyUtils.factorial(5));
    }
    





}
