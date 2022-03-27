package com.example.todoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class hasil_main extends AppCompatActivity {

    TextView tsk, jns, tim;

    String intsk, inJns, inTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_main);

        tsk = findViewById(R.id.taks1);
        jns = findViewById(R.id.task2);
        tim = findViewById(R.id.task3);

        Bundle bnd = getIntent().getExtras();

        inJns = bnd.getString("jns");
        intsk = bnd.getString("tsk");
        inTime = bnd.getString("tme");

        tsk.setText(intsk);
        jns.setText(inJns);
        tim.setText(inTime);


    }



}