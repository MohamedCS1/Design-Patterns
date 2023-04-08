package Structural.decorator

import Structural.proxy.MailService

fun main() {
    val mailService = MailService()

    val smsDecorator = SmsDecorator()
    smsDecorator.setService(mailService)


    println(smsDecorator.sendMail())
}