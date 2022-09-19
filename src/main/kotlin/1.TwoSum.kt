// https://leetcode.com/problems/two-sum/

fun printArray(array: IntArray): Unit {
    println(array.joinToString ( prefix = "[", postfix = "]"))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed() { index, _ ->
        for (secondIndex in index + 1 until nums.size) {
            val sum = nums[index] + nums[secondIndex]
            if (sum == target) return intArrayOf(index, secondIndex)
        }
    }
    return intArrayOf()
}

fun main(args: Array<String>) {
    printArray(twoSum(intArrayOf(2, 7, 11, 15), target = 9))
    printArray(twoSum(intArrayOf(3, 2, 4), target = 6))
    printArray(twoSum(intArrayOf(3, 3), target = 6))
}
