package Structural.proxy

fun main() {
    val mailServiceProxy = MailServiceProxy()


    println(mailServiceProxy.sendMail())
    println(mailServiceProxy.sendMail())

    println(mailServiceProxy.sendMail())
}