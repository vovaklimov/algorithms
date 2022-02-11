package arrays

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class BinarySearchTest {

    @Test
    fun findsElementInSortedArray() {
        assertEquals(2, binarySearch(arrayOf(1, 2, 3, 4, 5), 3))

        assertEquals(4, binarySearch(arrayOf(1, 3, 4, 5, 6, 3), 6))

        assertEquals(0, binarySearch(arrayOf(1), 1))
    }

    @Test
    fun returnsNullIfElementNotFound() {
        assertNull(binarySearch(arrayOf(1, 2, 3), 4))
        assertNull(binarySearch(arrayOf(), 1))
    }

    @Test
    fun findsElementsOnArrayBoundaries() {
        val arr = arrayOf(1, 2, 3, 4)

        assertEquals(0, binarySearch(arr, 1))
        assertEquals(3, binarySearch(arr, 4))
    }

    @Test
    fun findsElementInArrayMid() {
        assertEquals(1, binarySearch(arrayOf(1, 2, 3), 2))

        assertEquals(2, binarySearch(arrayOf(1, 2, 3, 4), 3))
    }
}
