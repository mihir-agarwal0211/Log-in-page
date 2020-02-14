package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view){

        EditText UserId = (EditText) findViewById(R.id.UserId);
        EditText Password = (EditText) findViewById(R.id.Password);

        Log.i("Info","Please enter all values");
        Log.i("Logged", UserId.getText().toString());
        Log.i("Logged", Password.getText().toString());

        Toast.makeText(this, "Hi there!", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
