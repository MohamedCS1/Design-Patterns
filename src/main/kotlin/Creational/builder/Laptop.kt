package Creational.builder

class Laptop private constructor(private val cpu:String? ,private val gpu:String? ,private val ram:String? ,private val storage:String? ,private val price:String?){

    data class Builder(private var cpu:String?= null ,private var gpu:String?= null ,private var ram:String?= null ,private var storage:String?= null ,private var price:String?= null)
    {
        fun cpu(cpu: String) = apply { this.cpu = cpu }
        fun gpu(gpu: String) = apply { this.gpu = gpu }
        fun ram(ram: String) = apply { this.ram = ram }
        fun storage(storage: String) = apply { this.storage = storage }
        fun price(storage: String) = apply { this.price = storage }
        fun build() = Laptop(cpu ,gpu ,ram ,storage ,price)
    }

    fun getCpu():String
    {
        return this.cpu.toString()
    }

    fun getGpu():String
    {
        return this.gpu.toString()
    }

    fun getRam():String
    {
        return this.ram.toString()
    }

    fun getStorage():String
    {
        return this.storage.toString()
    }
    fun getPrice():String
    {
        return this.price.toString()
    }

}