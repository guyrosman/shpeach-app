package com.example.frcappfix;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent logInActivityIntent = new Intent(this, Login_Activity.class);
        this.startActivity(logInActivityIntent);

        Intent newUserActivityIntent = new Intent(this, New_User_Activity.class);
        this.startActivity(newUserActivityIntent);

        Intent mainScreenActivityIntent = new Intent(this, New_User_Activity.class);
        this.startActivity(mainScreenActivityIntent);


    }

}