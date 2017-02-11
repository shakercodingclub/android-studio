package com.example.velikovs.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        double[] tipInfo = new double[3];

        EditText billText = (EditText) findViewById(R.id.edit_message);
        EditText tipText = (EditText) findViewById(R.id.tip_input);
        EditText peepText = (EditText) findViewById(R.id.peep_input);

        tipInfo[0] = Double.parseDouble(billText.getText().toString());
        tipInfo[1] = Double.parseDouble(tipText.getText().toString())/100;
        tipInfo[2] = Double.parseDouble(peepText.getText().toString());

        Bundle mBundle = new Bundle();
        mBundle.putDoubleArray("array", tipInfo);

        intent.putExtras(mBundle);
        startActivity(intent);
    }
}
