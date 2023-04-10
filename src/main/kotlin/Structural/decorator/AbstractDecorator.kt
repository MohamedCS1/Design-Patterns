package Structural.decorator

import Structural.proxy.MailService


abstract class AbstractDecorator: MailService() {

    private lateinit var smsService:MailService

    fun setService(service: MailService)
    {
        smsService = service
    }

    override fun sendMail(): String {
        return smsService.sendMail()
    }
}