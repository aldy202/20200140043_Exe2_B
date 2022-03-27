package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    TextView register;
    EditText name, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.idsignin);

        name = findViewById(R.id.idName);

        edpassword = findViewById(R.id.idPass);

        register = findViewById(R.id.idregestrasi);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itr = new Intent(getApplicationContext(),Register_main.class);
                startActivity(itr);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = name.getText().toString();

                password = edpassword.getText().toString();

                String email = "aldy";

                String pass = "12345";

                if(nama.length()==0){
                    name.setError("Nama harus Diperlukan");
                    Toast.makeText(getApplicationContext(),"Data tidak Boleh Kosong !!",Toast.LENGTH_LONG).show();
                }
                else if(password.length()==0){
                    Toast.makeText(getApplicationContext(),"Password Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (!nama.equals(email)){
                    Toast.makeText(getApplicationContext(),"Nama salah",Toast.LENGTH_LONG).show();
                }
                else if (!password.equals(pass)){
                    Toast.makeText(getApplicationContext(),"Password salah",Toast.LENGTH_LONG).show();
                }
                else if(nama.equals(email)&&password.equals(pass)){
                    Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_LONG).show();

                    Bundle bn = new Bundle();
                    bn.putString("a",nama.trim());
                    Intent in = new Intent(getApplicationContext(),taks_main.class);
                    in.putExtras(bn);
                    startActivity(in);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Login gagal",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}