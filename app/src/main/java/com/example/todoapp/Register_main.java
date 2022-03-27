package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Register_main extends AppCompatActivity {

    TextInputEditText name,eml,pass,repass;
    Button btn;
    String mna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_main);

        name = findViewById(R.id.inputnama);
        eml = findViewById(R.id.email);
        pass = findViewById(R.id.Password);
        repass = findViewById(R.id.Repassword);
        btn = findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mna = name.getText().toString();

                if(name.getText().toString().length()==0){
                    name.setError("Nama tidak boleh kosong");
                }
                else if(eml.getText().toString().length()==0){
                    eml.setError("Nama tidak boleh kosong");
                }
                else if (pass.getText().toString().isEmpty()
                        ||repass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Data tidak boleh kosong",Toast.LENGTH_LONG).show();

                }
                else {
                    if (pass.getText().toString().equals(repass.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();

                        Bundle bn = new Bundle();

                        bn.putString("X", mna.trim());

                        Intent nt = new Intent(getApplicationContext(), taks_main.class);

                        nt.putExtras(bn);
                        startActivity(nt);

                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Password salah", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

    }
}