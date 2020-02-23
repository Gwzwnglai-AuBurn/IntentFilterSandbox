package com.gg.intentfilterdialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launchAbout(View v){
        Intent launch = new Intent(this, AboutActivity.class);
        startActivity(launch);
    }


    public void dialLaunch(View v){
        Intent launch = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9643122280"));
        startActivity(launch);
    }


//    this is an implicit intent
    public void launchSetting(View view) {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String stringToShare = "Hey guys, have you seen the latest shi";
        sharingIntent.putExtra(Intent.EXTRA_TEXT, stringToShare);
        startActivity(Intent.createChooser(sharingIntent, "share via"));
        //chooser creates a app choosing pop up menu
    }
}
