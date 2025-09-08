package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        Notifier sms = new SmsDecorator(base, "+91-99999-11111");
        sms.notify("Build green ✅");

        Notifier wa = new WhatsAppDecorator(base, "user_wa");
        wa.notify("Test msg");

        Notifier slack = new SlackDecorator(base, "deployments");
        slack.notify("Deploy done");

        Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        full.notify("Deployment completed 🚀");
    }
}
