package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginMainActivity2 extends AppCompatActivity {

    EditText Email, LPassword;
    Button LoginBtn,LogRegBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main2);

        Email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        LPassword = (EditText) findViewById(R.id.editTextTextPassword3);

        LoginBtn = (Button) findViewById(R.id.button2);
        LogRegBtn = (Button) findViewById(R.id.button3);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Email.getText().toString().isEmpty() &&
                   LPassword.getText().toString().isEmpty()){

                    Toast.makeText(loginMainActivity2.this,"Please fill the Register Form",
                            Toast.LENGTH_SHORT).show();

                }else if(Email.getText().toString().equals("admin@gmail.com") &&
                        LPassword.getText().toString().equals("1234")){
                    //start the Login to Homepage
                    startActivity(new Intent(loginMainActivity2.this,sucessMainActivity2.class));
                }
            }
        });

        LogRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Shift the Login to Homepage
                startActivity(new Intent(loginMainActivity2.this, MainActivity.class));
            }
        });
    }
}