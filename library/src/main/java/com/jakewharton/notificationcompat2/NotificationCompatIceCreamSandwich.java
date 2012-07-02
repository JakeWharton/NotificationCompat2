package com.jakewharton.notificationcompat2;

import android.app.Notification;

public class NotificationCompatIceCreamSandwich implements NotificationCompat2.NotificationCompatImpl {
    static Notification.Builder createBuilder(NotificationCompat2.Builder b) {
        Notification.Builder builder = NotificationCompatHoneycomb.createBuilder(b);
        if (b.mProgressSet) {
            builder.setProgress(b.mProgress, b.mProgressMax, b.mProgressIndeterminate);
        }
        return builder;
    }

    @Override
    public Notification build(NotificationCompat2.Builder builder) {
        return createBuilder(builder).build();
    }
}
