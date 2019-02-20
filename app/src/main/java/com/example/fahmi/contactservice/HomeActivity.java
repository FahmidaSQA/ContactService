package com.example.fahmi.contactservice;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    Button Edu,Hospi,pol,Fire,ticket,food;
    ImageView mappic,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Edu=(Button)findViewById(R.id.Edu);

        Edu.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), Edu.class);

                startActivity(i);

            }

        });
        Hospi=(Button)findViewById(R.id.Hospi);

        Hospi.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), Hospi.class);

                startActivity(i);

            }

        });
        pol=(Button)findViewById(R.id.pol);

        pol.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), police.class);

                startActivity(i);

            }

        });
        Fire=(Button)findViewById(R.id.Fire);

        Fire.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), Fire.class);

                startActivity(i);

            }

        });
        ticket=(Button)findViewById(R.id.ticket);

        ticket.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), ticket.class);

                startActivity(i);

            }

        });
        food=(Button)findViewById(R.id.food);

        food.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), foodcorner.class);

                startActivity(i);

            }

        });
        about=(ImageView)findViewById(R.id.about);

        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), about.class);
                startActivity(i);
            }

        });

        mappic=(ImageView)findViewById(R.id.mappic);

        mappic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }

        });


     //   directory=(ImageView)findViewById(R.id.directory);

      //  directory.setOnClickListener(new View.OnClickListener() {

         //   @Override
       //     public void onClick(View v) {
//
        //        startActivity(new Intent(getApplicationContext(), Contactcreator.class));
      //      }

     //   });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Khulna Contect Services")
                .setMessage("Do you want to exit this application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

    public void browser1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.kh"));
        startActivity(browserIntent);
    }

}

