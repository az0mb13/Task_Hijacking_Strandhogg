package com.zombie.ssa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText username, password;
Button clk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        clk = (Button) findViewById(R.id.button);
    }

    public void movepage(View v){
        String stname = username.getText().toString();
        String stpass = password.getText().toString();
        if (stname.equals("admin") && stpass.equals("admin123")) {
            Intent in = new Intent(MainActivity.this, LoggedIn.class);
            in.putExtra("username", stname);
            in.putExtra("password", stpass);
            startActivity(in);
        }

    }
}