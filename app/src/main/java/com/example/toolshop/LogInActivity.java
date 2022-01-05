package com.example.toolshop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {

    private Button btnLogInLogInActivity;
    private EditText editTextTextEmailAddressLogIn, editTextTextPasswordLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        initializedViews();

        btnLogInLogInActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validateData()) {
                    Toast.makeText(LogInActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LogInActivity.this, OrderActivity.class);
                    startActivity(intent);
                }
            }
        });


    }

    // Method for Data Validation
    private boolean validateData() {


//        Email Validation
        String emailInput = editTextTextEmailAddressLogIn.getEditableText().toString().trim();

        if (emailInput.isEmpty()) {
            editTextTextEmailAddressLogIn.setError("Please Enter Email Address");
            return false;

//        Using Built In Patterns For Validating Email Address
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            editTextTextEmailAddressLogIn.setError("Please Enter Valid Email Address");
            return false;

        } else {
            editTextTextEmailAddressLogIn.setError(null);
        }


//        Password Validation
        if (editTextTextPasswordLogIn.getText().toString().equals("")) {
            editTextTextPasswordLogIn.setError("Please Enter Your Password");
            return false;

        } else {
            editTextTextPasswordLogIn.setError(null);
            return true;
        }


    }

    //Initializing Layout Elements
    private void initializedViews() {

        btnLogInLogInActivity = findViewById(R.id.btnLogInLogInActivity);

        editTextTextEmailAddressLogIn = findViewById(R.id.editTextTextEmailAddressSignIn);
        editTextTextPasswordLogIn = findViewById(R.id.editTextTextPasswordLogIn);

    }
}
