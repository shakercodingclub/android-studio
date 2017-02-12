package codes.shaker.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        String message = getIntent().getStringExtra(MainActivity.MESSAGE_KEY);
        TextView textBox = (TextView) findViewById(R.id.textBox);
        textBox.setText("Hi, "+message+", you've just made your first android app!");
    }
}
