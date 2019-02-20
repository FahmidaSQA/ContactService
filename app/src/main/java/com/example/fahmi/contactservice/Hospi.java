package com.example.fahmi.contactservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.net.Uri;

public class Hospi extends AppCompatActivity {
    Button kmc;
    Button sishuhospi;
    Button ibhpsi;
    Button gazihospi;
    Button AkijHospi;
    Button fultola;
    Button batiaghata;
    Button Rupshahealth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospi);


        kmc = (Button) findViewById(R.id.kmc);

        kmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-762601";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });


        sishuhospi = (Button) findViewById(R.id.sishuhospi);

        sishuhospi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-811708";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });

        ibhpsi = (Button) findViewById(R.id.ibhpsi);

        ibhpsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-810742";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });

        gazihospi = (Button) findViewById(R.id.gazihospi);

        gazihospi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-2861634";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });


        AkijHospi = (Button) findViewById(R.id.AkijHospi);

        AkijHospi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-723966";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });

        fultola = (Button) findViewById(R.id.fultola);

        fultola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-701069";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });

        batiaghata = (Button) findViewById(R.id.batiaghata);

        batiaghata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"01922-365706";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });
        Rupshahealth = (Button) findViewById(R.id.Rupshahealth);

        Rupshahealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-800115";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });

    }
}