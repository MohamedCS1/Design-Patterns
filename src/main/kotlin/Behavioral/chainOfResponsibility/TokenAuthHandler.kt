package Behavioral.chainOfResponsibility

class TokenAuthHandler:AuthHandler {

    private var nextHandler : AuthHandler? = null

    override fun authenticate(request: AuthRequest): Boolean {
        if (request.authType == AuthType.TOKEN)
        {
            println("Token authentication successful")
            return true
        }
        else
        {
            return nextHandler?.authenticate(request) ?: false
        }
    }

    override fun setNext(handler: AuthHandler): AuthHandler {
        nextHandler = handler
        return handler
    }

}