package com.example.custom_dialog_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignIn = findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LoginDialog loginDialog = new LoginDialog(MainActivity.this);
                        loginDialog.show();
                    }
                }
        );
    }
}