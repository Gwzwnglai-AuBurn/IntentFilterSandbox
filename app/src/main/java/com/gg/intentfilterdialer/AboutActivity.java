package com.gg.intentfilterdialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Bundle extras = getIntent().getExtras();

        TextView tv = (TextView)findViewById(R.id.textView_activty_about);
//        tv.setText(extras.getString("Message"));

        String recievedAction = getIntent().getAction();

        if(recievedAction != null){
            //Action detected.
            //Must be Incoming IMPLICIT intent from another app that wants to send
            String recievedActionType = getIntent().getType();

            if(recievedActionType.startsWith("text/")){

                String data = getIntent().getStringExtra(Intent.EXTRA_TEXT);
//                 tv.setText("text action detected! You must have arrieved via an IMPLICIT intent");
                tv.setText(data);
            }
        }else{
            //No Action deteced.
            //Explicit internal request from our own app,

            tv.setText(("Explicit intent dectected, no other apps want to play"));
        }
    }
}
