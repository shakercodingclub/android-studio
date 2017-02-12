package codes.shaker.tipcalculator;

import android.content.Intent;
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
        double tip = tipInfo[0]*tipInfo[1]/tipInfo[2];
        double total = (tipInfo[0]/tipInfo[2]) + tip;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String total_s = formatter.format(total);
        String tip_s = formatter.format(tip);

        TextView textView2 = (TextView)findViewById(R.id.textV2);
        textView2.setText(tip_s);

        TextView textView4 = (TextView)findViewById(R.id.textV4);
        textView4.setText(total_s);
    }

    public void newTip(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
