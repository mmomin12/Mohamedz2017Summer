package com.example.zaeem.mohamedz2017summer;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Toast;

import butterknife.OnClick;

public class NotificationActivity extends BaseActivity {

    private NotificationManager manager;

    @OnClick(R.id.activity_notifation_small)
    public void smallNotification(View v){
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setContentTitle("Title")
                .setContentText("Text")
                .setContentIntent(getDefalutIntent(Notification.FLAG_AUTO_CANCEL))
                .setNumber(10)
                .setTicker("Ticker")
                .setWhen(System.currentTimeMillis())
                .setPriority(Notification.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .setOngoing(false)
                .setDefaults(Notification.DEFAULT_SOUND)
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .setSmallIcon(R.mipmap.ic_launcher);
        NotificationCompat.BigPictureStyle bigPictureStyle =
                new NotificationCompat.BigPictureStyle();
        mBuilder.setStyle(bigPictureStyle);
        bigPictureStyle.setBuilder(mBuilder);
        bigPictureStyle.setBigContentTitle("BigContentTitle");
        bigPictureStyle.setSummaryText("summaryText");
        Bitmap bitmap1 = BitmapFactory.de
        manager.notify(notifyId,mBuilder.build());
    }

    private PendingIntent getDefalutIntent(int flags) {

        PendingIntent pendingIntent =  PendingIntent.getActivity(this,1,new Intent(), flags);
        return pendingIntent;

    }

    @OnClick(R.id.activity_notifation_big)
    public void bigNotification(View v){
        showToast("Big");

    }

    @OnClick(R.id.activity_notifation_pic)
    public void picNotification(View v){
        showToast("Pic");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        manager = getSystemService(NOTIFICATION_SERVICE);
    }
}
