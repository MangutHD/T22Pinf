package BinärBaume.test;

import Polynom.Polynom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void test() {

        Polynom polynom = new Polynom(new double[] {3.0,0.0,1,3});
        polynom.koeffizient();
        polynom.funktionswert(2);
        //assertEquals();
    }



}
