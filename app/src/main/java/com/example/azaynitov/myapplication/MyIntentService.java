package com.example.azaynitov.myapplication;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("");
    }

    public MyIntentService(String name) {
        super(name);
    }

    @Override

    protected void onHandleIntent(@Nullable Intent intent) {
        RandomString gen = new RandomString(8, ThreadLocalRandom.current());


        while (true) {
            String string=gen.nextString();
            System.out.println(string);

            Intent broadcastIntent = new Intent("GETER");
            broadcastIntent.putExtra("String", string);
            sendBroadcast(broadcastIntent);
            try {
                TimeUnit.SECONDS.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

     static final Intent newIntent(Context context) {
        return new Intent(context, MyIntentService.class);

    }

}
