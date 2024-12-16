package com.example.mycalcul;

import android.media.Session2Command;
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

public class SubActivity extends AppCompatActivity {
    String getNum1,getNum2;
    int num1,num2,result,sub;
    Button b7,b8;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        b7=(Button) findViewById(R.id.subt);
        b8=(Button) findViewById(R.id.bbutton);
        et1=(EditText) findViewById(R.id.n3);
        et2=(EditText) findViewById(R.id.n4);
        getNum1=et1.getText().toString();
        getNum2=et2.getText().toString();
        num1=Integer.parseInt(getNum1);
        num2=Integer.parseInt(getNum2);
        sub=num1-num2;
     Result =String.valueOf(sub);
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
    }
}