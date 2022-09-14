package com.example.btth4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUserName, edtPassWord;
    Button btnLogin, btnDangKy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = findViewById(R.id.txt_username);
        edtPassWord = findViewById(R.id.txt_password);
        btnLogin = findViewById(R.id.login);
        btnDangKy = findViewById(R.id.dangky);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "admin";
                String password = "admin";
                if(edtUserName.getText().toString().equals(username) & edtPassWord.getText().toString().equals(password)){
                    Toast.makeText(getApplicationContext(),R.string.loginsuccess,Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, giaoDienProfile.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),R.string.loginerror,Toast.LENGTH_LONG).show();
                }
            }
        });
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}