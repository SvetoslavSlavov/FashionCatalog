package com.example.svetoslavslavov.fashioncatalog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SingleViewActivity extends Activity {
    Button btn_order;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_view);

        // Get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

        btn_order =(Button)findViewById(R.id.btn_order);

        btn_order.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick (View view){
                Intent intent = new Intent(SingleViewActivity.this, SuccessScreen.class);
                startActivity(intent);
            }
        });
    }
}