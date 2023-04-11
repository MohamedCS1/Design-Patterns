package Structural.facade

class Database {
    fun findMedia(id:Int):Media
    {
        println("Searching for media in the database...")
        return Media(id ,"Media $id" ,"path/to/media" ,MediaType.VIDEO)
    }
}