package com.example.svetoslavslavov.fashioncatalog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GetStarted extends AppCompatActivity {

    Button btn_get_started;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.get_started);
        setContentView(R.layout.get_started);

        btn_get_started = (Button)findViewById(R.id.btn_get_started);

        btn_get_started.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetStarted.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}
