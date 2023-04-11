package Structural.facade

data class Media(val id:Int ,val name:String ,val filePath:String ,val type: MediaType, val data: ByteArray = byteArrayOf())
