package com.example.diraryappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.diraryappproject.Calendar.CalendarView;

public class MainActivity extends AppCompatActivity {
    EditText loginEmail, loginPassword;
    TextView noLoginEmail;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEmail = findViewById(R.id.emailEdit);
        loginPassword = findViewById(R.id.passwordEdit);

        loginBtn = findViewById(R.id.loginBtn);

        noLoginEmail =findViewById(R.id.noEmailBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalendarView.class);
                startActivity(intent);
            }
        });
    }

}
