import org.junit.jupiter.api.*;


public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBookTest = new PhoneBook();
        String name = "Alex";
        String phoneNum = "123-45";
        Boolean result = phoneBookTest.add(name, phoneNum);
        Boolean expected = true;
        Assertions.assertSame(expected,result);
    }
}


