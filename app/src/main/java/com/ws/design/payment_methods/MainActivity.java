package com.ws.design.payment_methods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView payment_method,payment_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();init1();
    }

    public void init() {

        TextView btn = (TextView) findViewById(R.id.payment_method);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent contact = new Intent(MainActivity.this, Payment_method.class);
                startActivity(contact);
            }
        });
    }

    public void init1(){

        TextView btn = (TextView)findViewById(R.id.payment_details);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent contact = new Intent(MainActivity.this,Payment_Details.class);
                startActivity(contact);
            }
        });
    }
}
