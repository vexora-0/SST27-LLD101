package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private String user;

    public WhatsAppDecorator(Notifier n, String user) {
        super(n);
        this.user = user;
    }

    @Override
    public void notify(String text) {
        System.out.println("[WHATSAPP -> " + user + "]: " + text);
        n.notify(text);
    }
}
