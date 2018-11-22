package com.example.lab605b.radio;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View v) {
        //is the current radio button now checked?

        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement

        switch (v.getId()){
            case R.id.rd1:
                if(checked) {
                    if (mp != null){
                        mp.release();
                    }
                    mp = MediaPlayer.create(this, R.raw.diamonds);
                    mp.start();
                    Toast.makeText(getApplicationContext(), "Diamonds", Toast.LENGTH_LONG).show();
                    break;
                }

            case R.id.rd2:
                if(checked){
                    if (mp != null){
                        mp.release();
                    }
                    mp = MediaPlayer.create(this, R.raw.countingstars);
                    mp.start();
                    Toast.makeText(getApplicationContext(), "Counting Stars", Toast.LENGTH_LONG).show();
                    break;
                }

            case R.id.rd3:
                if(checked){
                    if (mp != null){
                        mp.release();
                    }
                    mp = MediaPlayer.create(this, R.raw.chandelier);
                    mp.start();
                    Toast.makeText(getApplicationContext(), "Chandelier", Toast.LENGTH_LONG).show();
                    break;
                }

            case R.id.rd4:
                if(checked) {
                    if (mp != null){
                        mp.release();
                    }
                    mp = MediaPlayer.create(this, R.raw.happy);
                    mp.start();
                    Toast.makeText(getApplicationContext(), "Happy", Toast.LENGTH_LONG).show();
                    break;
                }

            case R.id.rd5:
                if(checked) {
                    if (mp != null){
                        mp.release();
                    }
                    mp = MediaPlayer.create(this, R.raw.meheart);
                    mp.start();
                    Toast.makeText(getApplicationContext(), "Me Heart", Toast.LENGTH_LONG).show();
                    break;
                }
        }
    }
}
