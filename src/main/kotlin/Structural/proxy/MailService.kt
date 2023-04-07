package Structural.proxy

class MailService: MailServiceInterface() {
    override fun sendMail(): String {
        return "send it"
    }
}