package other

fun getFibonacciNumber(n: Int): Int {
    var n0 = 1
    var n1 = 1
    var currentNumber = 0

    if (n < 3) {
        return 1
    }

    for (i in 3..n) {
        currentNumber = n0 + n1

        n0 = n1
        n1 = currentNumber
    }

    return currentNumber
}