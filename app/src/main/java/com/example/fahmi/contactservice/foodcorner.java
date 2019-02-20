package com.example.fahmi.contactservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodcorner extends AppCompatActivity {

    Button castleSalam;
    Button royelHotel;
    Button cityInn;
    Button westernInn;
    Button millennium;
    Button tigerGarden;
    Button grillHouse;
    Button borakHotel;
    Button delaxHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcorner);


        castleSalam = (Button) findViewById(R.id.castleSalam);

        castleSalam.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-762601";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


        royelHotel = (Button) findViewById(R.id.royelHotel);

        royelHotel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-730725";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        cityInn = (Button) findViewById(R.id.cityInn);

        cityInn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-813067";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        westernInn = (Button) findViewById(R.id.westernInn);

        westernInn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-733220";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


        millennium = (Button) findViewById(R.id.millennium);

        millennium.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-810799";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        tigerGarden = (Button) findViewById(R.id.tigerGarden);

        tigerGarden.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-721108";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        grillHouse = (Button) findViewById(R.id.grillHouse);

        grillHouse.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-730245";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });
        borakHotel = (Button) findViewById(R.id.borakHotel);

        borakHotel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"041-760055";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });
        delaxHotel = (Button) findViewById(R.id.delaxHotel);

        delaxHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-720604";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });


            }
        }