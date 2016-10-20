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

    
    
    
    
    //Test de edat 1 introducimos una fecha buena que nos devolvera 22 años.
    @Test
    public final void testEdat() {
        //fail ("Sin implementar");
        
        assertEquals(22, MyUtils.edat(24, 9, 1994));
    }

    //Test de edat 2 introducimos una fecha mala que nos devolvera -2.
    //Esta mal el año.
    @Test
    public final void testEdat2() {
        //fail ("Sin implementar");
        
        assertEquals(-2, MyUtils.edat(1, 1, 3016));
    }
    
    //Test de edat 3 introducimos una fecha mala que nos devolvera -2.
    //Esta mal el dia.
    @Test
    public final void testEdat3() {
        //fail ("Sin implementar");
        
        assertEquals(-2, MyUtils.edat(00, 1, 1994));
    }
    
    //Test de edat 4 introducimos una fecha mala que nos devolvera -2.
    //Esta mal el mes.
    @Test
    public final void testEdat4() {
        //fail ("Sin implementar");
        
        assertEquals(-2, MyUtils.edat(1, 13, 1994));
    }
    
    
    //Test de edat 5 introducimos una fecha de mas de 150 años que nos devolvera -1.
    //La edat es mas que 150.
    @Test
    public final void testEdat5() {
        //fail ("Sin implementar");
        
        assertEquals(-1, MyUtils.edat(1, 1, 1800));
    }
    
    
    
    
    
    
    //Test de factorial 1 introducimos un numero que nos devolvera -1
    //Hemos puesto 0.
    @Test
    public final void testFactorial() {
        //fail ("Sin implementar");
        
        assertEquals(120, MyUtils.factorial(5));
    }
    
    
    //Test de factorial 2 introducimos un numero que nos devolvera -1
    //Hemos puesto -5.
    @Test
    public final void testFactorial2() {
        //fail ("Sin implementar");
        
        assertEquals(-1, MyUtils.factorial(-5));
    }
    /*
    //Test de factorial 3 introducimos un numero que nos devolvera -1
    //Hemos puesto una letra.
    @Test
    public final void testFactorial3() {
        //fail ("Sin implementar");
        
        assertEquals(, MyUtils.factorial(a));
    }
    */




}
