package Structural.facade

class MultimediaLibraryFacade {
    private val database = Database()
    private val fileSystem = FileSystem()
    private val player = MultimediaPlayer()

    fun playMedia(id:Int)
    {
        val media = database.findMedia(id)
        val file = fileSystem.openFile(media.filePath)
        player.play(media.copy(data = file))
    }
}