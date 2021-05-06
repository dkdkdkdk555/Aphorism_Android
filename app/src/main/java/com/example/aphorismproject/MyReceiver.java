package com.example.aphorismproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_USER_PRESENT.equals(intent.getAction())){
            Intent i = new Intent(context, MainActivity.class);

            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(i);
        }

    }
}
