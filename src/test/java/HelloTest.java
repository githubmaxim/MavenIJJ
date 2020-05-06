import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @org.junit.jupiter.api.Test
    void hello() {
        assertEquals("Hello", Hello.hello());
    }

    @org.junit.jupiter.api.Test
    void helloAge() {
        assertEquals("Hello, 5", Hello.helloAge(5));
        assertEquals("Hello, 30", Hello.helloAge(30));
        assertEquals("Hello, 100", Hello.helloAge(100));
    }

    @org.junit.jupiter.api.Test
    void helloAgeZerro() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, ()->Hello.helloAge(0));
    }

    @org.junit.jupiter.api.Test
    void helloAgeNegative() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, ()->Hello.helloAge(-10));
    }
}