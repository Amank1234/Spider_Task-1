package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button button;

    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

    }

    public void next(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void nextnext(View view)
    {
        Intent i = new Intent(this,MainActivity3.class);
        startActivity(i);
    }
    public void nextnext2(View view)
    {
        Intent i = new Intent(this,MainActivity4.class);
        startActivity(i);
    }
}