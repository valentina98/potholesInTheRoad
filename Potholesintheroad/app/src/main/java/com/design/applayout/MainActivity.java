package com.design.applayout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String EXTRA_USERNAME = "com.example.applayout.USERNAME";
    Button loginBtn;
    Button registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn=(Button)findViewById(R.id.loginButton);
        loginBtn.setOnClickListener(this);

        registerBtn=(Button)findViewById(R.id.registerButton);
        registerBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginButton){
            Intent i = new Intent(MainActivity.this, NewsFeedActivity.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.registerButton){
            Intent i = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(i);
        }
    }
}