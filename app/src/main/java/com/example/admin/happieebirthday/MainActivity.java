package com.example.admin.happieebirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {   //onCreate is a  method which is automatically called(implicit call)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    //display the layout created through xml
    }
}
