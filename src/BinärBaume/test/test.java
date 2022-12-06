package BinärBaume.test;

import Polynom.Polynom;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    void input1Test() {
        Polynom polynom = new Polynom(new double[] {3.0,0.0,1.0,3.0,0.0});
        assertEquals("f(x) = 3x^3 + 1x^2 + 3", polynom.toString());
    }

    @Test
    void funktionswert1(){
        Polynom polynom = new Polynom(new double[] {3.0,0.0,1.0,3.0,0.0});
        assertEquals(31.0, polynom.functionValue(2));

    }

    @Test
    void ableitungTest(){
        Polynom ab = new Polynom(new double[] {3.0,0.0,1.0,3.0,0.0});
        String expected = Arrays.toString(new double[] { 0.0, 2.0, 9.0, 0.0, 0.0 });
        String actual = Arrays.toString(ab.derivationCoefficients());
        assertEquals(expected,actual);
    }

    @Test
    void gradTest(){
        Polynom grad = new Polynom(new double[] {1.0,2.0,0.0,0.0,0.0});
        grad.getDegree();
    }

    @Test
    void pqTest(){
        Polynom pq = new Polynom(new double[] {0.0,3.0,1.0,0.0,0.0});
        assertEquals("[0.0, -3.0]", pq.getZeropoints().toString());
    }


}
