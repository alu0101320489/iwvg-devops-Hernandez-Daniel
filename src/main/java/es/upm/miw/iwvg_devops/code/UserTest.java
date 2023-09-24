package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        // Create a new User object before each test
        user = new User("1", "Daniel", "Hernandez", new ArrayList<>());
    }

    @Test
    void testGetId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Daniel", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Pablo");
        assertEquals("Pablo", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Hernandez", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Perez");
        assertEquals("Perez", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Daniel Hernandez", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("D.", user.initials());
    }

    @Test
    void testGetFractions() {
        List<Fraction> fractions = user.getFractions();
        assertEquals(0, fractions.size());
    }

    @Test
    void testSetFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(1, 2));
        user.setFractions(newFractions);
        assertEquals(new Fraction(1, 2), user.getFractions().get(0));
    }

    @Test
    void testAddFraction() {
        Fraction fraction = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(2, 3);
        user.addFraction(fraction);
        user.addFraction(fraction2);
        assertEquals(new Fraction(1, 3), user.getFractions().get(0));
        assertEquals(new Fraction(2, 3), user.getFractions().get(1));
    }

    @Test
    void testToString() {
        String expectedToString = "User{id='1', name='Daniel', familyName='Hernandez', fractions=[]}";
        assertEquals(expectedToString, user.toString());
    }
}