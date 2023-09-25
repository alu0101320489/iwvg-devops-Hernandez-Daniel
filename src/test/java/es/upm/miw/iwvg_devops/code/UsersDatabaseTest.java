package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UsersDatabaseTest {
    @Test
    void testFindFractionSubtractionByUserName() {
        UsersDatabase database = new UsersDatabase();
        Optional<Fraction> result = database.findFractionSubtractionByUserName("Ana");
        assertEquals(22, result.orElse(null).getNumerator());
        assertEquals(60, result.orElse(null).getDenominator());
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        UsersDatabase database = new UsersDatabase();
        List<String> familyNames = database.findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList());

        List<String> expectedFamilyNames = List.of("Fernandez", "Blanco", "López", "Torres");
        assertEquals(expectedFamilyNames, familyNames);
    }

    @Test
    void testFindDecimalImproperFractionByUserName() {
        UsersDatabase database = new UsersDatabase();
        List<Double> decimalValues = database.findDecimalImproperFractionByUserName("Ana")
                .collect(Collectors.toList());

        List<Double> expectedDecimalValues = List.of(2.0, 1.3333333333333333);
        assertEquals(expectedDecimalValues, decimalValues);
    }

    @Test
    void testFindUserFamilyNameByAllNegativeSignFractionDistinct() {
        UsersDatabase database = new UsersDatabase();
        List<String> familyNames = database.findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList());

        List<String> expectedFamilyNames = List.of();
        assertEquals(expectedFamilyNames, familyNames);
    }
}
