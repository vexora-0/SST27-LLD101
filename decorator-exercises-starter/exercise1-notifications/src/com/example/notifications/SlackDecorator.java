package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {
    private String channel;

    public SlackDecorator(Notifier n, String channel) {
        super(n);
        this.channel = channel;
    }

    @Override
    public void notify(String text) {
        System.out.println("[SLACK -> #" + channel + "]: " + text);
        n.notify(text);
    }
}
