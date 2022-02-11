import org.junit.Test
import other.getFibonacciNumber
import kotlin.test.assertEquals

class FibonacciTest {

    @Test
    fun returnsCorrectFirstFibonacciNumber() {
        assertEquals(1, getFibonacciNumber(1))
    }

    @Test
    fun returnsCorrectNthFibonacciNumber() {
        assertEquals(2, getFibonacciNumber(3))
        assertEquals(5, getFibonacciNumber(5))
    }
}