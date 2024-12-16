package com.example.mycalcul;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.xml.transform.Result;

public class DivActivity extends AppCompatActivity {
    String getNum1,getNum2;
    int num1,num2,div,result;
    Button b11,b12;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);
        b11=(Button) findViewById(R.id.divt);
        b12=(Button) findViewById(R.id.abutton);
        et1=(EditText) findViewById(R.id.n7);
        et2=(EditText) findViewById(R.id.n8);
        getNum1=et1.getText().toString();
        getNum2=et2.getText().toString();
        num1=Integer.parseInt(getNum1);
        num2=Integer.parseInt(getNum2);
        div=num1/num2;
        Result =String.valueOf(div);
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
    }
}