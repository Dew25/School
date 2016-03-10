/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvm
 */
public class ParseCodeTest {
    private ParseCode instance;
    
    public ParseCodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ParseCode inst = new ParseCode("36007143322");
        this.instance=inst;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDey method, of class ParseCode.
     */
    @Test
    public void testGetDey() {
        
       // ParseCode instance = new ParseCode();
        int expResult = 14;
        int result = this.instance.getDey();
        System.out.println("getDey="+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of getMonth method, of class ParseCode.
     */
    @Test
    public void testGetMonth() {
            //ParseCode instance = new ParseCode();
        int expResult = 07;
        int result = instance.getMonth();
        System.out.println("getMonth="+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of getYear method, of class ParseCode.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        //ParseCode instance = new ParseCode();
        int expResult = 1960;
        int result = instance.getYear();
        System.out.println("getYear="+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

  

    /**
     * Test of getAge method, of class ParseCode.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
       // ParseCode instance = new ParseCode();
        Integer expResult = 55;
        Integer result = instance.getAge();
        System.out.println("getMonth="+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class ParseCode.
     */
    @Test
    public void testGetGender() {
        
        //ParseCode instance = new ParseCode();
        String expResult = "Мужчина";
        String result = instance.getGender();
        System.out.println("getGender="+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthdey method, of class ParseCode.
     */
    @Test
    public void testGetBirthdey() {
        
       // ParseCode instance = new ParseCode();
        String expResult = "14.07.1960";
        String result = instance.getBirthdey();
        System.out.println("getBirthdey="+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
