package com.example.svetoslavslavov.fashioncatalog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SuccessScreen extends AppCompatActivity {

    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success_screen);

        btn_back =(Button)findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick (View view){
                Intent intent = new Intent(SuccessScreen.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}
