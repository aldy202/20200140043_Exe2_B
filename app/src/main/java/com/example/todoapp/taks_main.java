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

public class taks_main extends AppCompatActivity {

    TextView nama,namaaa;

    EditText msktsk,jnstsk,timtsk;

    FloatingActionButton action;

    String inNama, inTask, injns, intime,tonama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taks_main);
        msktsk = findViewById(R.id.msktask);
        jnstsk = findViewById(R.id.jnstask);
        timtsk = findViewById(R.id.lmtask);

        action = findViewById(R.id.registrasi);

        nama = findViewById(R.id.namaa);
        namaaa = findViewById(R.id.namaa2);

        Bundle bnl = getIntent().getExtras();
        inNama = bnl.getString("X");
        nama.setText(inNama);

        Bundle nl = getIntent().getExtras();
        tonama = nl.getString("a");
        namaaa.setText(tonama);


        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inTask = msktsk.getText().toString();
                injns = jnstsk.getText().toString();
                intime = timtsk.getText().toString();

                if (injns.length()==0){
                    jnstsk.setError("Jenis Task !!");
                    Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
                }
                else if(intime.length()==0){
                    timtsk.setError("Lama Task !!!");
                    Toast.makeText(getApplicationContext(), "isi semua data", Toast.LENGTH_SHORT).show();

                }
                else if(inTask.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();

                    Bundle bn = new Bundle();

                    bn.putString("tsk",inTask.trim());
                    bn.putString("jns",injns.trim());
                    bn.putString("tme",intime.trim());

                    Intent nte = new Intent(getApplicationContext(),hasil_main.class);

                    nte.putExtras(bn);
                    startActivity(nte);
                }
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.look,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.sumbit){
            inTask = msktsk.getText().toString();
            injns = jnstsk.getText().toString();
            intime = timtsk.getText().toString();

            if (injns.length()==0){
                jnstsk.setError("Jenis Task !!");
                Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
            }
            else if(intime.length()==0){
                timtsk.setError("Lama Task !!!");
                Toast.makeText(getApplicationContext(), "isi semua data", Toast.LENGTH_SHORT).show();

            }
            else if(inTask.isEmpty()){
                Toast.makeText(getApplicationContext(), "Isi semua data", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();

                Bundle bn = new Bundle();

                bn.putString("tsk",inTask.trim());
                bn.putString("jns",injns.trim());
                bn.putString("tme",intime.trim());

                Intent nte = new Intent(getApplicationContext(),hasil_main.class);

                nte.putExtras(bn);
                startActivity(nte);
            }
        }
        else {
            Intent it = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(it);
        }
        return super.onOptionsItemSelected(item);
    }
}