package com.example.svetoslavslavov.fashioncatalog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    Button swimming_suit_btn;
    Button btn_grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        swimming_suit_btn =(Button)findViewById(R.id.swimming_suit_btn);
        btn_grid = (Button)findViewById(R.id.btn_grid);

        swimming_suit_btn.setOnClickListener(new View.OnClickListener(){


        @Override
        public void onClick (View view){
            Intent intent = new Intent(HomeScreen.this, DetailScreen.class);
            startActivity(intent);
        }
    });
        btn_grid.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick (View view){
                Intent intent = new Intent(HomeScreen.this, Grid.class);
                startActivity(intent);
            }
        });

    }



}
