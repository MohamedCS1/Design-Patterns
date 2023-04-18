package Behavioral.visitor

interface Element {
    fun accept(visitor:Visitor)
}