package com.myapplicationdev.android.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnDone;
    EditText etName, etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDone = findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get the edit text that user keys in name & age
                etName = findViewById(R.id.editTextName);
                etAge = findViewById(R.id.editTextAge);

                //put the name and age into an array
                String[] info = {etName.getText().toString(),
                etAge.getText().toString()};

                //create an intent to start another activity called DemoActivities
                Intent i = new Intent(MainActivity.this, DemoActivities2.class);

                //Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                //Start new activity
                startActivity(i);
            }
        });
    }
}
