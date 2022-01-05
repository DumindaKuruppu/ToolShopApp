package com.example.toolshop;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.sql.SQLOutput;

public class SignUpActivity extends AppCompatActivity {


//    Declaring layout elements

    private EditText editTextTextEmailAddressSignIn, editTextNIC, editTextPhone, editTextPassword, editTextConfirmPassword;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initializedViews();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                initializedSignUp();

                if (validateData()) {
                    Intent intent = new Intent(SignUpActivity.this, OrderActivity.class);
                    startActivity(intent);

                    SignUpData newUser = new SignUpData(editTextTextEmailAddressSignIn.getText().toString(),
                            editTextNIC.getText().toString(),
                            editTextPhone.getText().toString(),
                            editTextPassword.getText().toString());

                    Gson gson = new Gson();
                    gson.toJson(newUser);

                    System.out.println(newUser);
                }
            }
        });
    }


    public class SignUpData {
        private String email;
        private String nic;
        private String phone;
        private String password;

        public SignUpData(String email, String nic, String phone, String password) {
            this.email = email;
            this.nic = nic;
            this.phone = phone;
            this.password = password;
        }

        @Override
        public String toString() {
            return "SignUpData{" +
                    "email='" + email + '\'' +
                    ", nic='" + nic + '\'' +
                    ", phone='" + phone + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    //    Initializing Sign Up
    public boolean initializedSignUp() {
        if (validateData()) {

            Toast toast = Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG);
            toast.show();

        } else {

        }
        return true;
    }


    // Method for Data Validation
    private boolean validateData() {


//        Email Validation
        String emailInput = editTextTextEmailAddressSignIn.getEditableText().toString().trim();

        if (emailInput.isEmpty()) {
            editTextTextEmailAddressSignIn.setError("Please Enter Email Address");
            return false;

//        Using Built In Patterns For Validating Email Address
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            editTextTextEmailAddressSignIn.setError("Please Enter Valid Email Address");
            return false;

        } else {
            editTextTextEmailAddressSignIn.setError(null);
        }


//        NIC validation
        String NICInput = editTextNIC.getEditableText().toString().trim();

        if (NICInput.isEmpty()) {
            editTextNIC.setError("Please Enter NIC Number");
            return false;

        } else if (NICInput.length() == 10) {

            if (!(NICInput.endsWith("X") || NICInput.endsWith("V"))) {
                editTextNIC.setError("Please Enter Valid NIC");
                return false;
            }

        } else if (!(NICInput.length() == 12)) {
            editTextNIC.setError("Please Enter Valid NIC Number");
            return false;

        } else {
            editTextNIC.setError(null);
        }


//        Phone Number Validation
        String phoneInput = editTextPhone.getEditableText().toString().trim();

        if (phoneInput.isEmpty()) {
            editTextPhone.setError("Please Enter Phone Number");
            return false;

        } else if (!(Patterns.PHONE.matcher(phoneInput).matches() && phoneInput.length() == 10)) {
            editTextPhone.setError("Please Enter Valid Phone Number");
            return false;

        } else {
            editTextPhone.setError(null);
        }


//        Passwords Validation
        String passwordInput = editTextPassword.getEditableText().toString().trim();
        String passwordConfirmInput = editTextConfirmPassword.getEditableText().toString().trim();

        if (passwordInput.isEmpty()) {
            editTextPassword.setError("Please enter your password");
            return false;
        }

        if (passwordConfirmInput.isEmpty()) {
            editTextConfirmPassword.setError("Please enter your password again");
        } else if (!editTextPassword.getText().toString().equals(editTextConfirmPassword.getText().toString())) {
            editTextConfirmPassword.setError("Passwords do not match");
            editTextPassword.setError("Passwords do not match");
            return false;

        }

        return true;
    }


    //    Initializing layout elements.
    private void initializedViews() {
        editTextTextEmailAddressSignIn = findViewById(R.id.editTextTextEmailAddressSignIn);
        editTextNIC = findViewById(R.id.editTextNIC);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);

        btnSignUp = findViewById(R.id.btnSignUpSignUpActivity);
    }
}