package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = (TextView) findViewById(R.id.editTextNumber);
        textView2 = (TextView) findViewById(R.id.editTextNumberSigned);
        textView3 = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();

        textView1.setText(getIntent().getStringExtra("text1"));
        textView2.setText(getIntent().getStringExtra("text2"));






    }

    public void onButtonAdd(View view){

        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumberSigned);

        TextView textView = (TextView) findViewById(R.id.textView3);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float sum = num1 + num2;

        textView.setText(editText1.getText()+"+"+editText2.getText()+"="+Float.toString(sum));

    }


    public void onButtonSubstract(View view){

        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumberSigned);

        TextView textView = (TextView) findViewById(R.id.textView3);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float sub = num1 / num2;

        textView.setText(editText1.getText()+"-"+editText2.getText()+"="+Float.toString(sub));

    }


    public void onButtonDevide(View view){

        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumberSigned);

        TextView textView = (TextView) findViewById(R.id.textView3);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float divide = num1 / num2;

        textView.setText(editText1.getText()+"/"+editText2.getText()+"="+Float.toString(divide));

    }


    public void onButtonMultiply(View view){

        EditText editText1 = (EditText) findViewById(R.id.editTextNumber);
        EditText editText2 = (EditText) findViewById(R.id.editTextNumberSigned);

        TextView textView = (TextView) findViewById(R.id.textView3);

        float num1 = Float.parseFloat(editText1.getText().toString());
        float num2 = Float.parseFloat(editText2.getText().toString());

        float mul = num1 + num2;

        textView.setText(editText1.getText()+"*"+editText2.getText()+"="+Float.toString(mul));

    }

}