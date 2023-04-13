package Behavioral.chainOfResponsibility

fun main() {
    val basicAuthHandler = BasicAuthHandler()
    val tokenAuthHandler = TokenAuthHandler()

    basicAuthHandler.setNext(tokenAuthHandler)
    basicAuthHandler.authenticate(AuthRequest(AuthType.TOKEN))
}