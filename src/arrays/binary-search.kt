package arrays

/**
 * Searches the array or the range of the array for the provided [value] using the binary search algorithm.
 * Time efficiency: O(logN).
 * @param sortedArray array to search in, should be sorted in non-descending order
 * @param value element to search for
 * @return index of value in provided array
 * */
fun binarySearch(
    sortedArray: Array<Int>,
    value: Int,
): Int? {
    val size = sortedArray.size
    var left = 0
    var right = size - 1

    while (left <= right) {
        val mid = (left + right) / 2
        val guess = sortedArray[mid]

        when {
            guess == value -> return mid
            guess > value -> right = mid - 1
            guess < value -> left = mid + 1
        }
    }

    return null
}