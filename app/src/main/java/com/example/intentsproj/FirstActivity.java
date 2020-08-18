package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String Extra_msg = "com.example.IntentsProj.MESSAGE";
    private Button button;

    EditText text1, text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        text1 = (EditText) findViewById(R.id.editTextNumber);
        text2 = (EditText) findViewById(R.id.editTextNumberSigned);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                String msg = text1.getText().toString();
                intent.putExtra("text1", msg);

                String msg2 = text2.getText().toString();
                intent.putExtra("text2", msg2);

                intent.putExtra(Extra_msg, msg);

                Toast txt = Toast.makeText(getApplicationContext(), "Sending message", Toast.LENGTH_SHORT);
                txt.show();

                startActivity(intent);
            }
        });
    }

}