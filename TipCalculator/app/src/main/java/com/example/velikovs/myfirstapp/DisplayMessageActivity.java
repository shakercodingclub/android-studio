package com.example.velikovs.myfirstapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        double[] tipInfo = bundle.getDoubleArray("array");
        double ans = tipInfo[0]*tipInfo[1]/tipInfo[2];

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String answer = formatter.format(ans);

        TextView textView2 = (TextView)findViewById(R.id.textV2);
        textView2.setText(answer);
    }

    public void newTip(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
