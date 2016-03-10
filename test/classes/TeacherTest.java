/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvm
 */
public class TeacherTest {
    private Teacher instance;
    public TeacherTest() {
    }
    
    @Before
    public void setUp() {
        Teacher instance = new Teacher("IT", null, "Ants", "Tamm", "35807142543");
        this.instance=instance;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Teacher.
     */
    @Test
    public void testToString() {
     
        String expResult = "I am Teacher{\n\t" + 
                "name=Ants"  +
                "\n\tfamily=Tamm"  +
                "\n\tage=57" +
                "\n\tsection=IT"+
                "\n\tsalary=800.0"+
                "\n\tМой день рождения:14.07.1958"+                       
                "\n\t}";
        String result = instance.toString();
        System.out.println("result="+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
