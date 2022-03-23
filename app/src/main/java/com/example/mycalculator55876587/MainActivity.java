package com.example.mycalculator55876587;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    String Opr = "+";
    String PrevNumber = "" ;
    boolean NewOp = true;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }
    public void numberEvent (View view)
    {
        if(NewOp)
            ed1.setText("");
        NewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId())
        {
            case    R.id.bu1:
                number += "1";
                break;
            case    R.id.bu2:
                number += "2";
                break;
            case    R.id.bu3:
                number += "3";
                break;
            case    R.id.bu4:
                number += "4";
                break;
            case    R.id.bu5:
                number += "5";
                break;
            case    R.id.bu6:
                number += "6";
                break;
            case    R.id.bu7:
                number += "7";
                break;
            case    R.id.bu8:
                number += "8";
                break;
            case    R.id.bu9:
                number += "9";
                break;
            case    R.id.bu0:
                number += "0";
                break;
            case    R.id.buPeroid:
                number += ".";
                break;
            case    R.id.buPlusMinus:
                number = "-"+number;
                break;
        }
        ed1.setText (number);
    }
    public void operatorEvent (View view)
    {
        NewOp = true;
        PrevNumber = ed1.getText().toString();
        switch (view.getId()){
            case R.id.buMultiply: Opr = "*"; break;
            case R.id.buDevide:   Opr = "/"; break;
            case R.id.buMinus:    Opr = "-"; break;
            case R.id.buPlus:     Opr = "+"; break;
        }

    }
    public void equalEvent(View view) {
        String curNumber = ed1.getText().toString();
        double result = 0.0;
        switch (Opr)
        {
            case "+":
                result = Double.parseDouble(PrevNumber)+ Double.parseDouble(curNumber); break;
            case "-":
                result = Double.parseDouble(PrevNumber)- Double.parseDouble(curNumber); break;
            case "*":
                result = Double.parseDouble(PrevNumber)* Double.parseDouble(curNumber); break;
            case "/":
                result = Double.parseDouble(PrevNumber)/ Double.parseDouble(curNumber); break;
        }
        ed1.setText((int) result);
    }
}

