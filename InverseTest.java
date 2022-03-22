import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/*
*Test case file for Inverse.java
*February 27, 2022
*/
public class InverseTest {

    // Fixture initialization.
    @BeforeClass
    public void setUp() {
    }

    @Test
    public void firstNameTest() {
        String firstNameActual = Inverse.inverseFirstName("Benjamin");
        String firstNameExpected = "Nimajneb";
        assertEquals(firstNameExpected, firstNameActual);
    }

    @Test
    public void middleNameTest() {
        String middleNameActual = Inverse.inverseMiddleName("Donny");
        String middleNameExpected = "Ynnod";
        assertEquals(middleNameExpected, middleNameActual);
    }

    @Test
    public void lastNameTest() {
        String lastNameActual = Inverse.inverseLastName("Franklin");
        String lastNameExpected = "Nilknarf";
        assertEquals(lastNameExpected, lastNameActual);
    }

    @Test
    public void combineFullNameTest1() {
        String combineFullNameActual = Inverse.combineFullName("benjamin", "donny", "franklin");
        String combineFullNameExpected = "Nimajneb Ynnod Nilknarf";
        assertEquals(combineFullNameExpected, combineFullNameActual);
    }

    @Test
    public void combineFullNameTest2() {
        String combineFullNameActual = Inverse.combineFullName("benjamin", "n/a", "franklin");
        String combineFullNameExpected = "Nimajneb Nilknarf";
        assertEquals(combineFullNameExpected, combineFullNameActual);
    }
}
