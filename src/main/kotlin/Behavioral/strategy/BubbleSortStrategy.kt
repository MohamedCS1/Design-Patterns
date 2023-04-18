package Behavioral.strategy

class BubbleSortStrategy:SortingStrategy {
    override fun sort(numbers: MutableList<Int>): MutableList<Int> {
        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                if (numbers[i] > numbers[j]) {
                    val temp = numbers[i]
                    numbers[i] = numbers[j]
                    numbers[j] = temp
                }
            }
        }
        return numbers
    }
}