package com.zombie.ssa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoggedIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loggedin_activity);

        TextView userdisp = (TextView) findViewById(R.id.userdisp);
        TextView passdisp = (TextView) findViewById(R.id.passdisp);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");
        userdisp.setText(username);
        passdisp.setText(password);
    }
}