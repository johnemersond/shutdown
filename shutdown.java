package com.schogini.PowerOff;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;


public class PowerOffActivity extends Activity {

    PowerManager pm;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        Button mBuyButton = (Button) findViewById(R.id.button1);

        mBuyButton.setOnClickListener(new View.OnClickListener() 
        {
            public void onClick(View v) 
            {
                pm.reboot("null");
            }
        });
    }
}