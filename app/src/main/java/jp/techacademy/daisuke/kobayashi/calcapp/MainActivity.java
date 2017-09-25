package jp.techacademy.daisuke.kobayashi.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity{

    EditText Value1, Value2;
    double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.ka);
        Button button2 = (Button) findViewById(R.id.gen);
        Button button3 = (Button) findViewById(R.id.zyou);
        Button button4 = (Button) findViewById(R.id.zyo);

        button1.setOnClickListener(button1ClickListener);
        button2.setOnClickListener(button2ClickListener);
        button3.setOnClickListener(button3ClickListener);
        button4.setOnClickListener(button4ClickListener);

    }

    OnClickListener button1ClickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {

            Value1 = (EditText) findViewById(R.id.value1);
            Value2 = (EditText) findViewById(R.id.value2);

            a = Double.parseDouble(Value1.getText().toString());
            b = Double.parseDouble(Value2.getText().toString());

            Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
            intent.putExtra("VALUE1", a);
            intent.putExtra("VALUE2", b);
            intent.putExtra("FLAG",1);
            startActivity(intent);
        }
    };

    OnClickListener button2ClickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {

            Value1 = (EditText) findViewById(R.id.value1);
            Value2 = (EditText) findViewById(R.id.value2);

            a = Double.parseDouble(Value1.getText().toString());
            b = Double.parseDouble(Value2.getText().toString());

            Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
            intent.putExtra("VALUE1", a);
            intent.putExtra("VALUE2", b);
            intent.putExtra("FLAG",2);
            startActivity(intent);
        }
    };

    OnClickListener button3ClickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {

            Value1 = (EditText) findViewById(R.id.value1);
            Value2 = (EditText) findViewById(R.id.value2);

            a = Double.parseDouble(Value1.getText().toString());
            b = Double.parseDouble(Value2.getText().toString());

            Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
            intent.putExtra("VALUE1", a);
            intent.putExtra("VALUE2", b);
            intent.putExtra("FLAG",3);
            startActivity(intent);
        }
    };

    OnClickListener button4ClickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {

            Value1 = (EditText) findViewById(R.id.value1);
            Value2 = (EditText) findViewById(R.id.value2);

            a = Double.parseDouble(Value1.getText().toString());
            b = Double.parseDouble(Value2.getText().toString());

            Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
            intent.putExtra("VALUE1", a);
            intent.putExtra("VALUE2", b);
            intent.putExtra("FLAG",4);
            startActivity(intent);
        }
    };
}

/*
    @Override
    public void onClick(View v) {

        Value1 = (EditText) findViewById(R.id.value1);
        Value2 = (EditText) findViewById(R.id.value2);

        a = Double.parseDouble(Value1.getText().toString());
        b = Double.parseDouble(Value2.getText().toString());

        Intent intent = new Intent(this, Second_Activity.class);
        intent.putExtra("VALUE1", a);
        intent.putExtra("VALUE2", b);
        startActivity(intent);
    }
}
*/