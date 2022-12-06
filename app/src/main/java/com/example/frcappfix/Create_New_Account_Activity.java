package com.example.frcappfix;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Create_New_Account_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.println(Log.INFO,"intent log", "success" );
    }
    EditText email_editText;
    EditText password_editText;
    EditText confirm_password_editText;
    EditText first_name_editText;
    EditText last_name_editText;
    EditText user_name_editText;
    EditText birthday_editText;
    EditText phone_number_editText;
    RadioGroup gender_radioGroup;


}
