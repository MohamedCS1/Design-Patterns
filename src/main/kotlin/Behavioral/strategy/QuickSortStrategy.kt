package Behavioral.strategy

class QuickSortStrategy:SortingStrategy {
    override fun sort(numbers: MutableList<Int>): MutableList<Int> {
        if (numbers.size <= 1) {
            return numbers
        }

        val pivot = numbers[numbers.size / 2]
        val (left, right) = numbers.partition { it < pivot }

        sort(left.toMutableList())
        sort(right.toMutableList())

        numbers.clear()
        numbers.addAll(left)
        numbers.addAll(right)

        return numbers
    }
}