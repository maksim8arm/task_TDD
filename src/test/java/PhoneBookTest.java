import org.junit.Before;
import org.junit.jupiter.api.*;


public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBookTest = new PhoneBook();
        String name = "Alex";
        String phoneNum = "123-123";
        Boolean result = phoneBookTest.add(name, phoneNum);
        Boolean expected = true;
        Assertions.assertSame(expected, result);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBookTest = new PhoneBook();
        phoneBookTest.add("Alex", "123-123");
        String result =  phoneBookTest.findByNumber("123-123");
        String expected = "Alex";
        Assertions.assertSame(expected, result);
    }

    @Test
    public void findByName(){
        PhoneBook phoneBookTest = new PhoneBook();
        phoneBookTest.add("Alex", "123-123");
        String result =  phoneBookTest.findByName("Alex");
        String expected = "123-123";
        Assertions.assertSame(expected, result);
    }


}


