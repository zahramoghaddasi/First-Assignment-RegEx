import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Test2 {

    static Exercise3 handle;

    @BeforeAll
    static void setup() {
        handle = new Exercise3();
    }

    @Test
    void validateEmailTest1() {
        String email = "hello_World@geeksforgeeks.org";
        assertTrue(handle.validateEmail(email));
    }

    @Test
    void validateEmailTest2() {
        String email = "invalid-email";
        assertFalse(handle.validateEmail(email));
    }

    @Test
    void validateEmailTest3() {
        String email = "test@example.com";
        assertTrue(handle.validateEmail(email));
    }

}