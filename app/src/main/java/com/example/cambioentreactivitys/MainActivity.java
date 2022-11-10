package com.example.cambioentreactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View view){
        Intent intent = new Intent(this, Activity2.class);
        EditText editText = (EditText) findViewById(R.id.editTextName);
        String name = editText.getText().toString();
        System.out.println(name);
        intent.putExtra(EXTRA_NAME, name);
        startActivity(intent);
    }
}