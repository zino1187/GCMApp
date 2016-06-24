package com.example.zino.gcmapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/*
 * Google Cloud 서버가 메세지를 보내면, 디바이스가 그 메세지를 청취하여
 * 브로드 케스팅 하므로, 이 메세지를 청취하려면 BroadCastReceiver가 필요하다!!
 */
public class GcmReceiver extends WakefulBroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        // Explicitly specify that GcmIntentService will handle the intent.
        ComponentName comp = new ComponentName(context.getPackageName(),GcmIntentService.class.getName());

        // Start the service, keeping the device awake while it is launching.
        startWakefulService(context, (intent.setComponent(comp)));
        setResultCode(Activity.RESULT_OK);
    }
}












