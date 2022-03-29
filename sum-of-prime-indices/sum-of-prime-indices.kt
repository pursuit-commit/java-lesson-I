/**** KOTLIN ****/

fun main(args: Array<String>){  
    val input1: IntArray = IntArray();
    val input2: IntArray = intArrayOf(1, 2, 3, 4);
    val input3: IntArray = intArrayOf(1, -2, -3, 4, 5, 6);
    val input4: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, 11, -12, 13, 14, 15);

    println(sumPrimeIndices(input1));
}

// In this Kata, you will be given an integer array and your task is to return the sum of elements occupying prime-numbered indices.

// The first element of the array is at index 0.

fun sumPrimeIndices(arr: IntArray): Int {
    // write code here
}