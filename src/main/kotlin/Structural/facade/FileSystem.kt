package Structural.facade

class FileSystem {
    fun openFile(path:String):ByteArray
    {
        println("Opening file at $path...")
        return "FileContent".toByteArray()
    }
}