// https://leetcode.com/problems/palindrome-number/

fun isPalindrome(x: Int): Boolean {
    val xInStr = x.toString()
    return xInStr == xInStr.reversed()
}

fun main(args: Array<String>) {
    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(10))
}
