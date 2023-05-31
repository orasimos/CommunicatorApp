package com.example.intentcommunicatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    //Text inputs
    private TextInputEditText phoneNumberTextInput;
    private TextInputEditText smsNumberTextInput;
    private TextInputEditText emailAddressTextInput;

    //Buttons
    private AppCompatButton callBtn;
    private AppCompatButton smsBtn;
    private AppCompatButton emailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumberTextInput = findViewById(R.id.phoneNumberTextInput);
        smsNumberTextInput = findViewById(R.id.smsNumberTextInput);
        emailAddressTextInput = findViewById(R.id.emailAddressTextInput);
        callBtn = findViewById(R.id.callBtn);
        smsBtn = findViewById(R.id.smsBtn);
        emailBtn = findViewById(R.id.emailBtn);

        phoneNumberTextInput.addTextChangedListener(textWatcher);
        smsNumberTextInput.addTextChangedListener(textWatcher);
        emailAddressTextInput.addTextChangedListener(textWatcher);
    }

//    TextWatcher to enable buttons
    private final TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String phoneNumber = phoneNumberTextInput.getText().toString().trim();
            String smsNumber = smsNumberTextInput.getText().toString().trim();
            String emailAddress = emailAddressTextInput.getText().toString().trim();

            callBtn.setEnabled(!phoneNumber.isEmpty());
            smsBtn.setEnabled(!smsNumber.isEmpty());
            emailBtn.setEnabled(!emailAddress.isEmpty());

            callBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent callIntent = new Intent();
                }
            });

            smsBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent smsIntent = new Intent();
                }
            });

            emailBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}