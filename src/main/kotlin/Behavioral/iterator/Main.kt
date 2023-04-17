package Behavioral.iterator

fun main() {
    val collection = MyCollection(listOf("Mohamed" ,"Ahmed" ,"Abdou" ,"Jamal"))
    val iterator = collection.iterator()

    while (iterator.hasNext())
    {
        val item = iterator.next()
        println(item)
    }
}