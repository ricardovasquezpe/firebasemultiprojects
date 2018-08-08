package com.example.ftf_newuser.firebaseenviroment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.crash.FirebaseCrash;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FirebaseCrash.log("Activity created");
        array.size();

    }
}
