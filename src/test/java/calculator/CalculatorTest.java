package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    void sum() {
        assertEquals(21,calc.sum(10,11));
    }

    @Test
    void dif() {
        assertEquals(-1,calc.dif(10,11));
    }

    @Test
    void div() {
        assertEquals(5,calc.div(10,2));
    }

    @Test
    void mult() {
        assertEquals(110,calc.mult(10,11));
    }

    @Test
    void prc() {
        assertEquals(7,calc.prc(150,5));
    }

    @Test
    void mod() {
        assertEquals(2,calc.mod(22,4));
    }

    @Test
    void inc() {
        assertEquals(11,calc.inc(10));
    }
}