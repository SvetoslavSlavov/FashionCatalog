package com.example.svetoslavslavov.fashioncatalog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailScreen extends AppCompatActivity {

    Button btn_order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_screen);

        btn_order =(Button)findViewById(R.id.btn_order);

        btn_order.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick (View view){
                Intent intent = new Intent(DetailScreen.this, SuccessScreen.class);
                startActivity(intent);
            }
        });

    }
}
