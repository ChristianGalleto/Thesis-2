package com.example.john.studentrecordrequest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pending_Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending__registrar);


        final TextView notif1 = (TextView) findViewById(R.id.notif1);


        final Intent intent = getIntent();
        final String firstname = intent.getStringExtra("firstname");
        final String middlename = intent.getStringExtra("middlename");
        final String lastname = intent.getStringExtra("lastname");
        final String account = intent.getStringExtra("account");

        notif1.setText(firstname);


    }
}
