package Behavioral.iterator

data class MyCollection(val items:List<String>)
{
    fun iterator():Iterator<String>
    {
        return MyIterator(items)
    }
}
