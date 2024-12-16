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

public class MulActivity extends AppCompatActivity {
    String getNum1,getNum2;
    int num1,num2,mul,result;
    Button b9,b10;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        b5=(Button) findViewById(R.id.multipbutton);
        b6=(Button) findViewById(R.id.obutton);
        et1=(EditText) findViewById(R.id.n5);
        et2=(EditText) findViewById(R.id.n6);
        getNum1=et1.getText().toString();
        getNum2=et2.getText().toString();
        num1=Integer.parseInt(getNum1);
        num2=Integer.parseInt(getNum2);
        mul=num1*num2;
        Result =String.valueOf(mul);
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
    }
}