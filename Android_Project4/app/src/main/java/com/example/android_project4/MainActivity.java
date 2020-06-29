package com.example.android_project4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText x = findViewById(R.id.edittext);
        Button a = findViewById(R.id.button);
        Button b = findViewById(R.id.button2);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = x.getText().toString();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("data1", username);
                startActivity(i);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(j);
            }
        });
    }
}