package com.example.login_page_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userEmail,userPassword;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userEmail = findViewById(R.id.username);
        userPassword = findViewById(R.id.password);
        loginButton = findViewById(R.id.login);
        displayValues();
    }

    public void displayValues(){
        loginButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String uname = userEmail.getText().toString();
                        String pass = userPassword.getText().toString();
                        System.out.println(uname);
                        System.out.println(pass);
                        if(uname.equals("abc@gmail.com"))
                        {
                            if(pass.equals("123456"))
                            {
                                Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
                            }
                            else {
                                Toast.makeText(MainActivity.this, "Credentials are incorrect!!" , Toast.LENGTH_LONG).show();
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "Credentials are incorrect!!" , Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}