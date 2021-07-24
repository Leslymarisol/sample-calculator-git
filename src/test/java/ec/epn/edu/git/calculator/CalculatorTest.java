package ec.epn.edu.git.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("SetUpClass()");
    }

    @Before
    public void setUp(){
        System.out.println("SetUp()");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok(){
        System.out.println("Test 1");
        assertEquals(6,c.addition(3,3));
    }

    @Test
    public void given_tow_integers_when_substracted_then_ok(){
        System.out.println("Test 2");
        assertEquals(5,c.substraction(10,5));
    }

}