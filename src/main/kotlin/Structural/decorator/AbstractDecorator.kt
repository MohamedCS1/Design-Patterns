package Structural.decorator


import Structural.proxy.MailServiceInterface

abstract class AbstractDecorator:MailServiceInterface() {

    private lateinit var smsService:MailServiceInterface

    fun setService(service: MailServiceInterface)
    {
        smsService = service
    }

    override fun sendMail(): String {
        return smsService.sendMail()
    }
}