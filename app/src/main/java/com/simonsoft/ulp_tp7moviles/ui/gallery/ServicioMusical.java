package com.simonsoft.ulp_tp7moviles.ui.gallery;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.view.View;

import com.simonsoft.ulp_tp7moviles.R;

public class ServicioMusical extends Service {

    private MediaPlayer mp;
    int posicion = 0;
    public ServicioMusical() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mp = MediaPlayer.create(this, R.raw.carnaval );
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp.start();

        return START_NOT_STICKY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}