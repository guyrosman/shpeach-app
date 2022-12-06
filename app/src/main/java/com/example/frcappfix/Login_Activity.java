package com.example.frcappfix;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {
    EditText enter_mail_editText;
    EditText enter_password_editText;
    TextView incorrect_mail_or_password_textView;
    Button login_button;
    Button forgot_password_button;
    Button create_new_account_button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.println(Log.INFO,"intent log", "success" );
        login_button.setOnClickListener();
    }




}
