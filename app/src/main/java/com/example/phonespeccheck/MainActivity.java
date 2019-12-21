package com.example.phonespeccheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtUsername, edtPassword;
    private Button btnLogin;
    private String username = "samchiew520@gmail.com", password = "uzumaki0407";
    private String username1 = "alice@outlook.com", password1 = "ilovenewera88";
    private String username2 = "ryzen@amd.com", password2 = "threadripper33";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews() {
        edtUsername = findViewById(R.id.login_email_input);
        edtPassword = findViewById(R.id.login_password_input);
        btnLogin = findViewById(R.id.login_btn);
    }

    private void setListeners() {

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputUsername = edtUsername.getText().toString();
                String inputPassword = edtPassword.getText().toString();

                if (inputUsername.equals(username) && inputPassword.equals(password) ||inputUsername.equals(username1) && inputPassword.equals(password1) || inputUsername.equals(username2) && inputPassword.equals(password2) ) {
                    //               Toast.makeText(login1.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
                    finish();

                } else {
                    Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
