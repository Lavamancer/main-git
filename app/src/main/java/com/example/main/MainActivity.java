package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
        ### Git submodule integration
        ```sh
        git submodule add https://github.com/Lavamancer/main-git sdk
        cd sdk
        git checkout jalbarracin/feature
        ```
        ### Git submodule update
        ```sh
        git submodule sync // After cloning project
        git submodule update --init --recursive --remote
        cd sdk
        git checkout jalbarracin/feature2
        ```

     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello Main New Branch");
    }
}
