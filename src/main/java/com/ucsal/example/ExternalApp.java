package com.ucsal.example;

import com.ucsal.notification.channels.EmailNotification;
import com.ucsal.notification.channels.WhatsAppNotification;
import com.ucsal.notification.models.Notification;

public class ExternalApp {
	public static void main(String[] args) {
        // Exemplo de uso do EmailNotification
        EmailNotification emailNotification = new EmailNotification("smtp.example.host", "user","password");
        Notification notification = new Notification("seu@email", "Subject", "Message");
        emailNotification.send(notification);

        // Exemplo de uso do WhatsAppNotification
        WhatsAppNotification whatsAppNotification = new WhatsAppNotification();
        Notification notificationWpp = new Notification("number", "Message","Olá");
        whatsAppNotification.send(notificationWpp);
	}
}
