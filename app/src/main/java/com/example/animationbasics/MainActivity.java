package com.example.animationbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    private View square;
    private ViewGroup sceneRoot;
    private int newSquareSize = 800;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sceneRoot = findViewById(R.id.container);
        square = findViewById(R.id.transition_square);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(sceneRoot);
                ViewGroup.LayoutParams params = square.getLayoutParams();
                params.width = newSquareSize;
                params.height = newSquareSize;
                square.setLayoutParams(params);
            }
        });
    }
}
