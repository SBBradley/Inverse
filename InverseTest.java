import org.junit.Test;
import static org.junit.Assert.*;

/*
*Test case file for Inverse.java.
*February 27, 2022
*/
public class InverseTest {

@Test
public void firstNameTest() {
assertEquals("nimajneb", Inverse.inverseFirstName("benjamin") );
}

@Test
public void middleNameTest() {
assertEquals("ynnod", Inverse.inverseMiddleName("donny") );
}

@Test
public void lastNameTest() {
assertEquals("nilknarf", Inverse.inverseLastName("franklin") );
}

@Test
public void combineFullNameTest1() {
assertEquals("nimajneb ynnod nilknarf", Inverse.combineFullName("benjamin", "donny", "franklin") );
}

@Test
public void combineFullNameTest2() {
assertEquals("nimajneb nilknarf", Inverse.combineFullName("benjamin", "n/a", "franklin") );
}
}
