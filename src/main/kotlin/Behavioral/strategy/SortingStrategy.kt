package Behavioral.strategy

interface SortingStrategy {
    fun sort(numbers:MutableList<Int>):MutableList<Int>
}