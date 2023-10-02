package com.example.a13_unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    Button button2 ;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edittext);
        button2 = findViewById(R.id.button2);
        textview = findViewById(R.id.textview);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = edittext.getText().toString();
                double kilos = Double.parseDouble(inputText);

                double pounds = makeconversion(kilos);
                textview.setText(" "+ pounds);

            }
        });

    }
    public double makeconversion(double kilos){
        // 1 kilo = 2.20462
        return kilos  * 2.20462;


    }

}