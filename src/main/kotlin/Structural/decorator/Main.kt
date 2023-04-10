package Structural.decorator

import Structural.proxy.ConcreteMailService

fun main() {
    val mailService = ConcreteMailService()

    val smsDecorator = SmsDecorator()
    smsDecorator.setService(mailService)


    println(smsDecorator.sendMail())
}