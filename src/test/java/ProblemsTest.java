import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {

    @org.junit.jupiter.api.Test
    void isPrime() {
        assertAll(
                ()-> assertTrue(Problems.isPrime(5)),
                ()-> assertTrue(Problems.isPrime(9)),
                ()-> assertTrue(Problems.isPrime(7)),
                ()-> assertFalse(Problems.isPrime(4)),
                ()-> assertFalse(Problems.isPrime(2))

        );
    }
}