package org.code_crew.soundboard;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(6)
                .setAudioAttributes(audioAttributes)
                .build();

        sound1 = soundPool.load(this, R.raw.sound1, 1);
        sound2 = soundPool.load(this, R.raw.sound2, 1);
        sound3 = soundPool.load(this, R.raw.sound3, 1);
        sound4 = soundPool.load(this, R.raw.sound4, 1);
        sound5 = soundPool.load(this, R.raw.sound5, 1);
    }

    public void playSound(View view)
    {
        soundPool.play(sound1,1,1,0,0,1);

        soundPool.play(sound2,1,1,0,0,1);

        soundPool.play(sound3,1,1,0,0,1);

        soundPool.play(sound4,1,1,0,0,1);

        soundPool.play(sound5,1,1,0,0,1);

    }

    public void stopSound(View view)
    {
        soundPool.stop(sound1);
        soundPool.stop(sound2);
        soundPool.stop(sound3);
        soundPool.stop(sound4);
        soundPool.stop(sound5);
    }
}
