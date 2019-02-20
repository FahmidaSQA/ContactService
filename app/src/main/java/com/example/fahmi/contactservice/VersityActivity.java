package com.example.fahmi.contactservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VersityActivity extends AppCompatActivity {

    Button kuet,ku,northwest,northen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_versity);

        kuet = (Button) findViewById(R.id.kuet);

        kuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-769468";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });


        ku = (Button) findViewById(R.id.ku);

        ku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"041-721791";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });

        northwest = (Button) findViewById(R.id.northWestern);

        northwest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"  041-730807";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });

        northen = (Button) findViewById(R.id.northen);

        northen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String number =/*editText.getText().toString();*/"01755-514650";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);

            }
        });


    }
}

