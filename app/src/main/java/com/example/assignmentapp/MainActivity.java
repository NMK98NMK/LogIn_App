package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Firstname, Lastname, RegEmail, Password, RePassword;
    Button RegisterBtn, RegLogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firstname=(EditText)findViewById(R.id.editTextText);
        Lastname=(EditText)findViewById(R.id.editTextText2);
        RegEmail=(EditText)findViewById(R.id.editTextText3);
        Password=(EditText)findViewById(R.id.editTextTextPassword);
        RePassword=(EditText)findViewById(R.id.editTextTextPassword2);

        RegisterBtn=(Button)findViewById(R.id.button);
        RegLogBtn=(Button)findViewById(R.id.button5);

        RegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Firstname.getText().toString().isEmpty() &&
                   Lastname.getText().toString().isEmpty() &&
                   RegEmail.getText().toString().isEmpty() &&
                   Password.getText().toString().isEmpty() &&
                   RePassword.getText().toString().isEmpty()){

                    Toast.makeText(MainActivity.this,"Please fill the Register Form",
                            Toast.LENGTH_SHORT).show();
                }else if(Firstname.getText().toString().equals("admin1") &&
                        Lastname.getText().toString().equals("admin2") &&
                        RegEmail.getText().toString().equals("admin@gmail.com") &&
                        Password.getText().toString().equals("1234") &&
                        RePassword.getText().toString().equals("1234")){

                    //start the register to login
                    startActivity(new Intent(MainActivity.this,loginMainActivity2.class));
                }
            }
        });

        RegLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Shift to the register to login page
                startActivity(new Intent(MainActivity.this,loginMainActivity2.class));
            }
        });
    }
}