package com.anzero.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class shinigami extends AppCompatActivity {
TextView ans;
Button pushmetosee;
EditText firstnumber;
EditText secondnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.kira);
        firstnumber = findViewById(R.id.firstnumber);
        secondnumber = findViewById(R.id.secondnumber);
        pushmetosee = findViewById(R.id.pushmetosee);
        ans = findViewById(R.id.ans);

    }
    public void doit (View view)
    {
        double l = Double.parseDouble(firstnumber.getText().toString());
        double y = Double.parseDouble(secondnumber.getText().toString());
        ans.setText(""+(l + y));

    }
}
     // Who are we to tell anyone what he can to do?
    // This project made by AbdullwahaB