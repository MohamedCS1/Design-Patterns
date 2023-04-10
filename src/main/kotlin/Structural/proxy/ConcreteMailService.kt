package Structural.proxy

class ConcreteMailService:MailService() {
    override fun sendMail(): String {
        return "mail send it"
    }
}