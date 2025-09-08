package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {
    private String phone;

    public SmsDecorator(Notifier n, String phone) {
        super(n);
        this.phone = phone;
    }

    @Override
    public void notify(String text) {
        System.out.println("[SMS -> " + phone + "]: " + text);
        n.notify(text);
    }
}
