package Structural.decorator

import java.lang.StringBuilder

class SmsDecorator:AbstractDecorator() {

    private fun sendSms():String
    {
        return "SMS send it"
    }

    override fun sendMail(): String {
        val result = StringBuilder()

        result.append(super.sendMail()+" ")
        result.append(sendSms())

        return result.toString()
    }
}