package com.example.medhist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainLoginActivity extends AppCompatActivity {
    EditText appUsername, appPassword;
    Button appLoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        appLoginBtn = findViewById(R.id.appLoginButton);
        appLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListOfHospitlsActivity.class);
                startActivity(intent);
            }
        });
    }
}
