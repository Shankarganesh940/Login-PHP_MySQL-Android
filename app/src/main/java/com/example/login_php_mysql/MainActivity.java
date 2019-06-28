package com.example.login_php_mysql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText pas,usr;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = (Button)findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        usr = (EditText) findViewById( R.id.username);
        pas = (EditText) findViewById(R.id.password);
    }

    public void loginBtn(View view) {
        String user = usr.getText().toString();
        String pass = pas.getText().toString();

        Background bg = new Background(this);
        bg.execute(user,pass);
    }
}