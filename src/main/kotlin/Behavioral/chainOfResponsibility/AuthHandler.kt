package Behavioral.chainOfResponsibility

interface AuthHandler {
    fun authenticate(request: AuthRequest):Boolean
    fun setNext(handler: AuthHandler):AuthHandler
}