package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // we added a method name is 'sayHello" here
    public void sayHello(View view){
        // in here button handle it
        // change the screen txt.
        // we access and change the text by using the id as reference
        TextView helloTextView =findViewById(R.id.helloTextView);
        helloTextView.setText("Hello android World " + counter++);

    }
}