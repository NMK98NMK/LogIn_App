package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sucessMainActivity2 extends AppCompatActivity {

    Button LogoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess_main2);

        LogoutBtn=(Button)findViewById(R.id.button4);

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //start the login to logout
                startActivity(new Intent(sucessMainActivity2.this,loginMainActivity2.class));
            }
        });
    }
}