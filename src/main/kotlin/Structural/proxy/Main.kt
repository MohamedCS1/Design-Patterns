package Structural.proxy

fun main() {
    val mailServiceProxy = MailService()


    println(mailServiceProxy.sendMail())
    println(mailServiceProxy.sendMail())

    println(mailServiceProxy.sendMail())
}