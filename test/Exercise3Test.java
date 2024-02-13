import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    static Exercise3 handle;

    @BeforeAll
    static void setup() {
        handle = new Exercise3();
    }

    @Test
    void extractURLTest1() {
        String text = "This is a website: https://www.shahidbeheshti.ir";
        String expected = "https://www.shahidbeheshti.ir";
        assertEquals(expected, handle.extractURL(text));
    }

    @Test
    void extractURLTest2() {
        String text = "This is a website: http://www.example.com";
        String expected = "http://www.example.com";
        assertEquals(expected, handle.extractURL(text));
    }

    @Test
    void extractURLTest3() {
        String text = "No URL in this text";
        assertNull(handle.extractURL(text));
    }

    @Test
    void extractURLTest4() {
        String text = "my website https://farid-karimi.github.io";
        String expected = "https://farid-karimi.github.io";
        assertEquals(expected, handle.extractURL(text));
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

    @Test
    void findWordsWithRepeatLettersTest1() {
        String text = "apple orange pear pineapple banana";
        List<String> expected = List.of("apple", "pineapple", "banana");
        List<String> result = handle.findWordsWithRepeatLetters(text);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void findWordsWithRepeatLettersTest2() {
        String text = "no words with repeat letters in this text";
        List<String> expected = List.of("repeat", "letters", "text");
        List<String> result = handle.findWordsWithRepeatLetters(text);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void findWordsWithRepeatLettersTest3() {
        String text = "apple apple orange orange";
        List<String> expected = List.of("apple", "apple");
        List<String> result = handle.findWordsWithRepeatLetters(text);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void findWordsWithRepeatLettersTest4() {
        String text = "word with repeat letters: hello";
        List<String> expected = List.of("hello", "repeat", "letters");
        List<String> result = handle.findWordsWithRepeatLetters(text);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }
}