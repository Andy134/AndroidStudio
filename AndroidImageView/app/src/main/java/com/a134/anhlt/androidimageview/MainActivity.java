package com.a134.anhlt.androidimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button showImage1Button;
    private Button showImage2Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.showImage1Button = (Button) findViewById(R.id.button);
        this.showImage2Button = (Button) findViewById(R.id.button2);

        this.showImage1Button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                showImage1();
            }
        });
        this.showImage2Button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                showImage2();
            }
        });
    }
    private void showImage1(){
        this.imageView.setImageResource(R.drawable.img0469);
    }
    private void showImage2(){
        this.imageView.setImageResource(R.drawable.img0470);
    }

}
