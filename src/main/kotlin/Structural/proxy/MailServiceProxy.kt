package Structural.proxy

class MailServiceProxy {

    val currentMailsSendIt = hashMapOf<String ,Int>()
    val userUid = "12345"
    fun sendMail(): String {
        if (currentMailsSendIt[userUid] == null)
        {
            currentMailsSendIt[userUid] = 0
        }
        currentMailsSendIt[userUid] = currentMailsSendIt[userUid]!! + 1

        if (currentMailsSendIt[userUid]!! >= 3)
        {
            return "The email not send"
        }
        MailService().sendMail()
        return "Email send it"
    }
}