package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    b=findViewById(R.id.myButton);
    b.setOnClickListener((View.OnClickListener) this);
}

    public void clickToast(View v) {
        Toast.makeText(getApplicationContext(), "Label has been updated", Toast.LENGTH_SHORT).show();
    }
}