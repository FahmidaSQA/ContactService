package com.example.fahmi.contactservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ticket extends AppCompatActivity {

    Button bus,train,airlines;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);


        bus=(Button)findViewById(R.id.bus);

        bus.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), BusActivity.class);

                startActivity(i);

            }

        });
        train=(Button)findViewById(R.id.train);

        train.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), TrainActivity.class);

                startActivity(i);

            }

        });
        airlines=(Button)findViewById(R.id.airlines);

        airlines.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {

// TODO Auto-generated method stub


                Intent i = new Intent(getApplicationContext(), AirlineActivity.class);

                startActivity(i);

            }

        });
    }
}
