package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten
     */
    public void eatCookie(View view){
        //TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView orderCookie = (ImageView) findViewById(R.id.android_cookie_image_view);
        orderCookie.setImageResource(R.drawable.aftercookie);
        //TODO: Find a reference to the TextView in the layout. Change the text
        TextView newOrder = (TextView) findViewById(R.id.status_text_view);
        newOrder.setText("I'm so full");
    }
}
