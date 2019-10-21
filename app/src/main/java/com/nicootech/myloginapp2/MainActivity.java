package com.nicootech.myloginapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameText, phoneText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText=findViewById(R.id.nameText);
        phoneText=findViewById(R.id.phoneText);
        button=findViewById(R.id.bottom);
        textView= findViewById(R.id.textView);



    }
    public void movepage(View view){
        String name = nameText.getText().toString();
        String phone= phoneText.getText().toString();

        if(name.equals("Ethan")&& phone.equals("4243331382")){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("sName", name);
            bundle.putString("sPhone", phone);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        else if(name.equals("") || phone.equals(""))
        {
            textView.setText("Enter both name and phone number");
            Toast.makeText(getBaseContext(),"Enter both name and phone number",Toast.LENGTH_LONG).show();
        }
        else
            {
                textView.setText("Wrong name or phone number entered");
                Toast.makeText(getBaseContext(),"Wrong name or phone number entered",Toast.LENGTH_LONG).show();

            }


    }
}
