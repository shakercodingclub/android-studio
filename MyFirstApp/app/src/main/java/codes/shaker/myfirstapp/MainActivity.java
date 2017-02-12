package codes.shaker.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE_KEY = "message1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_message(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText messageBox = (EditText) findViewById(R.id.message_box);
        String message = messageBox.getText().toString();
        intent.putExtra(MESSAGE_KEY, message);
        startActivity(intent);
    }
}
