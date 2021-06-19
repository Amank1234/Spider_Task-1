package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
//import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity4 extends AppCompatActivity {
private EditText editTextNumberDecimal;
private EditText editTextNumberDecimal2;
private TextView textView5;
private Button button5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        editTextNumberDecimal2 = findViewById(R.id.editTextNumberDecimal2);
        textView5 = findViewById(R.id.textView5);
        button5 = findViewById(R.id.button5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
    }
    public void calcul(View view)
    {
        view = this.getWindow().getDecorView();
        String s = editTextNumberDecimal.getText().toString();
        String s2 = editTextNumberDecimal2.getText().toString();
        double v1 = Double.parseDouble(s);
        double v2 = Double.parseDouble(s2);
        if(v1<3.0)
        {

            double p1 = v1/3;
            double p2 = p1*p1;
            double p3 = 1-p2;
            double p4 = Math.sqrt(p3);
            double p5 = 1/p4;
            textView5.setText("The Lorentz factor is = "+p5);
            p5 =Double.parseDouble(new DecimalFormat("##.####").format(p5));


            if(p5 == v2)
            {
                view.setBackgroundResource(R.color.green);
                Toast.makeText(this, "Correct answer!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                view.setBackgroundResource(R.color.red);
                final Vibrator vibe = (Vibrator) MainActivity4.this.getSystemService(Context.VIBRATOR_SERVICE);
                Button button5 = new Button(this);
                vibe.vibrate(80);
                Toast.makeText(this, "Wrong answer!", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this, "Invalid entry!Keep below 3.0", Toast.LENGTH_SHORT).show();
        }

    }
}