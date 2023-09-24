package es.upm.miw.iwvg_devops.code;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    void testConstructorWithArguments() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testDefaultConstructor() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        Fraction fraction = new Fraction(3, 5);
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        Fraction fraction = new Fraction(2,7);
        assertEquals(7, fraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        Fraction fraction = new Fraction(2, 3);
        fraction.setNumerator(4);
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        Fraction fraction = new Fraction(2, 3);
        fraction.setDenominator(4);
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal());
    }

    @Test
    void testToString() {
        Fraction fraction = new Fraction(3, 2);
        String expectedToString = "Fraction{numerator=3, denominator=2}";
        assertEquals(expectedToString, fraction.toString());
    }
}