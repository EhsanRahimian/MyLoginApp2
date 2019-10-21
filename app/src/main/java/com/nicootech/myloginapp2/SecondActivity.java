package com.nicootech.myloginapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView textView2 , textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        Bundle bundle = getIntent().getExtras();
        String data1 = bundle.getString("sName");
        String data2 = bundle.getString("sPhone");

        textView2.setText(data1);
        textView3.setText(data2);

        Toast.makeText(getBaseContext(),"The login was successfull", Toast.LENGTH_LONG).show();
    }
}
