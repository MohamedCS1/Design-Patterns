package Behavioral.iterator

class MyIterator(val items:List<String>):Iterator<String> {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < items.size
    }

    override fun next(): String {
        val item = items[index]
        index++
        return item
    }
}