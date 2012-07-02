package com.jakewharton.notificationcompat2;

import android.app.Notification;

class NotificationCompatBase implements NotificationCompat2.NotificationCompatImpl {
    public Notification build(NotificationCompat2.Builder b) {
        Notification result = b.mNotification;
        result.setLatestEventInfo(b.mContext, b.mContentTitle,
                b.mContentText, b.mContentIntent);
        return result;
  }
}
