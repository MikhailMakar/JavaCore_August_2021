package lessons.lesson19102021.testing;

import org.junit.jupiter.api.*;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciGeneratorTest {

    //Unit
    //Integration tests
    //E2E testing
    //smoke tests
    //mutation testing

    //TDD - Test Driven Development

    private static FibonacciGenerator fibonacciGenerator;

    @BeforeAll
    public static void setUp() {
        System.out.println("Setting up...");
        fibonacciGenerator = new FibonacciGenerator();
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each...");
    }

    @Test
    public void shouldReturnZeroWhenPassZero() {
        System.out.println("1");
        BigInteger fib = fibonacciGenerator.getFib(0);
        Assertions.assertEquals(BigInteger.ZERO, fib);
    }

    @Test
    public void shouldReturnOneWhenPassOne() {
        System.out.println("2");
        BigInteger fib = fibonacciGenerator.getFib(1);
        Assertions.assertEquals(BigInteger.ONE, fib);
    }

    @Test
    public void shouldReturnOneWhenPassTwo() {
        System.out.println("3");
        BigInteger fib = fibonacciGenerator.getFib(2);
        Assertions.assertEquals(BigInteger.ONE, fib);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenPassNegativeNumber() {
        System.out.println("4");
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fibonacciGenerator.getFib(-5)
        );
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each...");
        fibonacciGenerator.clearCache();
    }

    @AfterAll
    public static void clear() {
        System.out.println("The End!!!");
    }
}