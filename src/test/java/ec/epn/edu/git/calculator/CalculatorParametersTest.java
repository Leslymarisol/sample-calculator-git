package ec.epn.edu.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
private int a,b,expected;

@Parameterized.Parameters
public static Iterable<Object[]> parameters() {
    List<Object[]> objects = new ArrayList<Object[]>();
    objects.add(new Object[]{2, 4, 6});
    return objects;
}

public CalculatorParametersTest(int a, int b, int expected){
    this.a = a;
    this.b = b;
    this.expected = expected;
}

@Test

    public void given_parameters_when_addition_then_summation(){
    Calculator c = new Calculator();
    int actual = c.addition(a,b);
    assertEquals(expected,actual);

}
}