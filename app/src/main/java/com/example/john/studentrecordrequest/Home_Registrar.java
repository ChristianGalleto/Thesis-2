package com.example.john.studentrecordrequest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home_Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__registrar);


        //start here

        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button10 = (Button) findViewById(R.id.button10);
        final Button button11 = (Button) findViewById(R.id.button11);
        final Button button12 = (Button) findViewById(R.id.button12);
        final TextView display3 = (TextView) findViewById(R.id.textView4);

        final Intent intent = getIntent();
        final String firstname = intent.getStringExtra("firstname");
        final String middlename = intent.getStringExtra("middlename");
        final  String lastname = intent.getStringExtra("lastname");
        final String account = intent.getStringExtra("account");

        String registrar = firstname + " " + middlename + " " + lastname + "\n" +  account;
        display3.setText(registrar);



        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final ProgressDialog progressDialog = new ProgressDialog(Home_Registrar.this);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.show();


                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {

                                progressDialog.dismiss();
                            }
                        }, 3000);


                Intent Notif1Intent = new Intent(Home_Registrar.this, Notif_Registrar.class);
                Home_Registrar.this.startActivity(Notif1Intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final ProgressDialog progressDialog = new ProgressDialog(Home_Registrar.this);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.show();


                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {

                                progressDialog.dismiss();
                            }
                        }, 3000);

                Intent RequestListIntent = new Intent(Home_Registrar.this, RequestList_Registrar.class);
                RequestListIntent.putExtra("firstname", firstname );
                RequestListIntent.putExtra("middlename", middlename );
                RequestListIntent.putExtra("lastname", lastname );
                RequestListIntent.putExtra("account", account );
                Home_Registrar.this.startActivity(RequestListIntent);
            }
        });  button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final ProgressDialog progressDialog = new ProgressDialog(Home_Registrar.this);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.show();


                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {

                                progressDialog.dismiss();
                            }
                        }, 3000);

                Intent AddIntent = new Intent(Home_Registrar.this, AddUser_Registrar.class);
                Home_Registrar.this.startActivity(AddIntent);
            }
        });  button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final ProgressDialog progressDialog = new ProgressDialog(Home_Registrar.this);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.show();


                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {

                                progressDialog.dismiss();
                            }
                        }, 3000);

                Intent Set1Intent = new Intent(Home_Registrar.this, Settings_Registrar.class);
                Home_Registrar.this.startActivity(Set1Intent);
            }
        });  button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final ProgressDialog progressDialog = new ProgressDialog(Home_Registrar.this);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.show();


                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {

                                progressDialog.dismiss();
                            }
                        }, 3000);

                Intent Back1Intent = new Intent(Home_Registrar.this, LogIn.class);
                Home_Registrar.this.startActivity(Back1Intent);
            }
        });
    }
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Logout?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                finish();

                dialog.dismiss();

            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                // Do nothing
                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }
}
