import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookTest {

    PhoneBook phoneBookTest = new PhoneBook();

@AfterEach
public void clean(){
    phoneBookTest.phoneBook.clear();
}

    @Test
    public void testAdd() {
        String name = "Alex";
        String phoneNum = "123-123";
        Boolean result = phoneBookTest.add(name, phoneNum);
        Boolean expected = true;
        Assertions.assertSame(expected, result);

    }

    @Test
    public void testFindByNumber() {
        phoneBookTest.add("Alex", "123-123");
        String result = phoneBookTest.findByNumber("123-123");
        String expected = "Alex";
        Assertions.assertSame(expected, result);
    }

    @Test
    public void testFindByName() {
        phoneBookTest.add("Alex", "123-123");
        String result = phoneBookTest.findByName("Alex");
        String expected = "123-123";
        Assertions.assertSame(expected, result);
    }

    @Test
    public void testPrintAllNames() {
        phoneBookTest.add("Warg", "223-123");
        phoneBookTest.add("Tom", "333-123");
        phoneBookTest.add("Bob", "433-123");
        phoneBookTest.add("Alex", "553-123");
        ArrayList<String> result = phoneBookTest.printAllNames();
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Alex", "Bob", "Tom", "Warg"));
        Assertions.assertArrayEquals(expected.toArray(), result.toArray());
    }

}


