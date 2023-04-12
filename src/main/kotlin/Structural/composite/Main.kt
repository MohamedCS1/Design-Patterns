package Structural.composite

fun main() {
    val textViewOne = TextView("TextView One")
    val textViewTwo = TextView("TextView Two")
    val profilePicture = ImageView("Profile Picture")
    val webView = WebView("webView")

    val newContainer = Container("New Container" , mutableListOf())

    val container = Container(children = mutableListOf(textViewOne ,textViewTwo ,profilePicture ,webView ,newContainer))

    container.printChildren()
}