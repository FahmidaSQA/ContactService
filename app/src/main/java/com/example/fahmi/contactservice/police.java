package com.example.fahmi.contactservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class police extends AppCompatActivity {

    Button khulnaPolice;
    Button sonadagaPolice;
    Button rupshaPolice;
    Button khalispurPolice;
    Button khanjahanPloice;
    Button batiaghatPolice;
    Button Horintana;
    Button daulutpurPolice;
    Button koyrapolice;
    Button fultolaPolice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);



        khulnaPolice = (Button) findViewById(R.id.khulnaPolice);

        khulnaPolice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01713-373285";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


        sonadagaPolice = (Button) findViewById(R.id.sonadagaPolice);

        sonadagaPolice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01713-373286";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        rupshaPolice = (Button) findViewById(R.id.rupshaPolice);

        rupshaPolice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01713-374109";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        khalispurPolice = (Button) findViewById(R.id.khalispurPolice);

        khalispurPolice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01713-373294";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });


        khanjahanPloice = (Button) findViewById(R.id.khanjahanPloice);

        khanjahanPloice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01713-373289";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        batiaghatPolice = (Button) findViewById(R.id.batiaghatPolice);

        batiaghatPolice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01713-374160";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        Horintana = (Button) findViewById(R.id.Horintana);

        Horintana.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01558328304";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });
        fultolaPolice = (Button) findViewById(R.id.fultolaPolice);

        fultolaPolice.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        String number =/*editText.getText().toString();*/"01713-373293";
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" + number));
                        startActivity(callIntent);

                    }
                });

        daulutpurPolice = (Button) findViewById(R.id.daulutpurPolice);

        daulutpurPolice.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
        String number =/*editText.getText().toString();*/"01713-374111";
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:" + number));
        startActivity(callIntent);

        }
        });

        koyrapolice = (Button) findViewById(R.id.koyrapolice);

        koyrapolice.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
        String number =/*editText.getText().toString();*/"01713-374103";
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:" + number));
        startActivity(callIntent);

        }
        });

            }
        }

