package jp.techacademy.daisuke.kobayashi.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1", 0);
        double value2 = intent.getDoubleExtra("VALUE2", 0);
        int flag = intent.getIntExtra("FLAG", 0);

        TextView textView = (TextView) findViewById(R.id.textView);

        if (flag == 1) {
            textView.setText(String.valueOf(value1 + value2));
        } else if (flag == 2) {
            textView.setText(String.valueOf(value1 - value2));
        } else if (flag == 3) {
            textView.setText(String.valueOf(value1 * value2));
        } else if (flag == 4) {
            textView.setText(String.valueOf(value1 / value2));
        }
    }
}