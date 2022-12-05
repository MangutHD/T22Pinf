package BinärBaume.test;

import Polynom.Polynom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    void input1Test() {
        Polynom polynom = new Polynom(new double[] {3.0,0.0,1.0,3.0,0.0});
        assertEquals("f(x)= 3.0x^3 + 1.0x^2 + 3.0", polynom.toString());
    }

    @Test
    void funktionswert1(){
        Polynom polynom = new Polynom(new double[] {3.0,0.0,1.0,3.0,0.0});
        assertEquals("31.0", polynom.funktionswert(2));

    }

    @Test
    void ableitungTest(){

        Polynom ab = new Polynom(new double[] {3.0,0.0,1.0,3.0,0.0});
        assertEquals("0.0 ",ab.ableitung());
    }

    @Test
    void gradTest(){
        Polynom grad = new Polynom(new double[] {1.0});
        grad.grad();
    }



}
