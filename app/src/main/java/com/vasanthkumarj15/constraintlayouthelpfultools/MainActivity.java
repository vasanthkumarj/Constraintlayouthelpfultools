package com.vasanthkumarj15.constraintlayouthelpfultools;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Placeholder placeholder;
    private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.constraint);
        placeholder=findViewById(R.id.place);
    }

    public void swap(View view) {
        TransitionManager.beginDelayedTransition(layout);
        placeholder.setContentId(view.getId());
    }
}
