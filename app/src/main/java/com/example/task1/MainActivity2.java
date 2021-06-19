package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button button3;
    private TextView textView;
    private EditText editTextTextPersonName;
    private TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button3 = findViewById(R.id.button3);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

    }

    public void calc(View view)
    {
        view = this.getWindow().getDecorView();
        String s = editTextTextPersonName.getText().toString();
        double v1 = Double.parseDouble(s);
//        final Vibrator vibe = (Vibrator) MainActivity2.this.getSystemService(Context.VIBRATOR_SERVICE);

        if(v1<3.0)
        {
            view.setBackgroundResource(R.color.green);
            double p1 = v1/3;
            double p2 = p1*p1;
            double p3 = 1-p2;
            double p4 = Math.sqrt(p3);
            double p5 = 1/p4;
            textView2.setText("The Lorentz factor is = "+p5);
        }
        else
        {
            view.setBackgroundResource(R.color.red);
            final Vibrator vibe = (Vibrator) MainActivity2.this.getSystemService(Context.VIBRATOR_SERVICE);
            Button button3 = new Button(this);
            vibe.vibrate(80);
            Toast.makeText(this, "Invalid entry!Keep below 3.0", Toast.LENGTH_SHORT).show();
        }
    }

}