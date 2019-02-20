package com.example.fahmi.contactservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Edu extends AppCompatActivity {

    Button school,college,versity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);


        school=(Button)findViewById(R.id.school);

        school.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), SchoolActivity.class);

                startActivity(i);

            }

        });
        college=(Button)findViewById(R.id.college);

        college.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), CollegeActivity.class);

                startActivity(i);

            }

        });
        versity=(Button)findViewById(R.id.versity);

        versity.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), VersityActivity.class);

                startActivity(i);

            }

        });
    }
}
