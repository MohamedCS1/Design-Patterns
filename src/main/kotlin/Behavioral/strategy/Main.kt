package Behavioral.strategy

fun main() {
    val numbers = mutableListOf(3 ,2 ,64 ,12 , 13 ,56 ,32 ,78 ,23 ,19 ,79 ,100)

    val bubbleSort = BubbleSortStrategy()
    val quickSort = QuickSortStrategy()

    val sorterOne = Sorter(bubbleSort)
    val sorterTwo = Sorter(quickSort)

    println(sorterOne.sort(numbers).toString())
    println(sorterTwo.sort(numbers).toString())

}