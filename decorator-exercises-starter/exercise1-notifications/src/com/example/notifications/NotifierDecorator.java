package com.example.notifications;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier n;

    public NotifierDecorator(Notifier n) {
        this.n = n;
    }
}
