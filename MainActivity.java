package com.example.buttondisable;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button enable;
    private Button disable;
    private TextView count;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enable = findViewById(R.id.enable);
        disable = findViewById(R.id.disable);
        count = findViewById(R.id.count);
        String text = "Counter: ";

        disable.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                disable.setEnabled(false);
                counter++;
                count.setText(text+counter);
            }
        });

        enable.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                disable.setEnabled(true);
            }
        });
    }
}