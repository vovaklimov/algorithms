package arrays

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class BinarySearchTest {

    @Test
    fun findsElementInSortedArray() {
        assertEquals(binarySearch(arrayOf(1, 2, 3, 4, 5), 3), 2)

        assertEquals(binarySearch(arrayOf(1, 3, 4, 5, 6, 3), 6), 4)

        assertEquals(binarySearch(arrayOf(1), 1), 0)
    }

    @Test
    fun returnsNullIfElementNotFound() {
        assertNull(binarySearch(arrayOf(1, 2, 3), 4))
        assertNull(binarySearch(arrayOf(), 1))
    }

    @Test
    fun findsElementsOnArrayBoundaries() {
        val arr = arrayOf(1, 2, 3, 4)

        assertEquals(binarySearch(arr, 1), 0)
        assertEquals(binarySearch(arr, 4), 3)
    }

    @Test
    fun findsElementInArrayMid() {
        assertEquals(binarySearch(arrayOf(1, 2, 3), 2), 1)

        assertEquals(binarySearch(arrayOf(1, 2, 3, 4), 3), 2)
    }
}