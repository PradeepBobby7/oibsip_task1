package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button buttonl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.text);
        editText = findViewById(R.id.number);
        buttonl = findViewById(R.id.button);

        buttonl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                textView.setText("The Value in Pound is" +pound);

            }
        });
    }
}