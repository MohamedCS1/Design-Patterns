package Behavioral.strategy

class Sorter(private var sortingStrategy: SortingStrategy) {
    fun sort(numbers:MutableList<Int>):MutableList<Int>
    {
        return sortingStrategy.sort(numbers)
    }
}