package Creational.builder

fun main() {

    val laptop = Laptop.Builder()
        .cpu("Intel i5")
        .storage("512 GB")
        .ram("8 GB DDR4")
        .gpu("Nvidia")
        .price("110000 DA")
        .build()

    println(laptop.getPrice())
}