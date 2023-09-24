package es.upm.miw.iwvg_devops.code;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    void testIsProper() {
        Fraction properFraction = new Fraction(1, 9);
        assertTrue(properFraction.isProper());

        Fraction improperFraction = new Fraction(8, 3);
        assertFalse(improperFraction.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction properFraction = new Fraction(1, 9);
        assertFalse(properFraction.isImproper());

        Fraction improperFraction = new Fraction(8, 3);
        assertTrue(improperFraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(4, 6);
        assertTrue(fraction1.isEquivalent(fraction2));

        Fraction fraction3 = new Fraction(1, 2);
        Fraction fraction4 = new Fraction(3, 4);
        assertFalse(fraction3.isEquivalent(fraction4));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(3, 5);
        Fraction sum = fraction1.add(fraction2);
        assertEquals(17, sum.getNumerator());
        assertEquals(20, sum.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction product = fraction1.multiply(fraction2);
        assertEquals(3, product.getNumerator());
        assertEquals(8, product.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction result = fraction1.divide(fraction2);
        assertEquals(3, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }
}