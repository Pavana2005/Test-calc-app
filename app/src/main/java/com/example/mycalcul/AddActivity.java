package com.example.mycalcul;

import android.content.Intent;
import android.graphics.text.LineBreaker;
import android.os.Bundle;
import android.view.PixelCopy;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.xml.transform.Result;

public class AddActivity extends AppCompatActivity {
    String getNum1,getNum2;
    int num1,num2,result,Sum;
    Button b5,b6;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        b5=(Button) findViewById(R.id.addt);
        b6=(Button) findViewById(R.id.gobutton);
        et1=(EditText) findViewById(R.id.n1);
        et2=(EditText) findViewById(R.id.n2);

        getNum1=et1.getText().toString();
        getNum2=et2.getText().toString();
        num1=Integer.parseInt(getNum1);
        num2=Integer.parseInt(getNum2);
        Sum=num1+num2;
     Result = String.valueOf(Sum);
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

    }
}