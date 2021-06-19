package com.example.task1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.icu.text.SimpleDateFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import static android.icu.text.SimpleDateFormat.*;

public class MainActivity3 extends AppCompatActivity {
    private TextView textView3;
    private TextView textView4;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;
    private Button button4;
//    private EditText editTextTime2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView3 = findViewById(R.id.textView3);
        button4 = findViewById(R.id.button4);
        textView4 = findViewById(R.id.textView4);
//        editTextTime2 = findViewById(R.id.editTextTime2);
    }

    public void cal(View view)
    {

        calendar = Calendar.getInstance();
        textView3.setText(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        int hr = calendar.get(Calendar.HOUR);
        int min = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);
//for(int z=0;z<100000;z++)
//{
//    editTextTime2.setText(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
//}
        if (min == 00 && sec == 00)
        {
            Toast.makeText(this, "Can't measure at this time", Toast.LENGTH_SHORT).show();
        }
        else
        {
            int f = 1;
            for (int i = 1; i <= hr; i++)
            {
                f = f * i;
            }
            int x = min * min * min;
            int y = x + sec;
            double f1 = f;
            double y1 = y;
            double z1 = f1 / y1;
            textView4.setText("The spi factor = " + z1);
        }
    }

}
