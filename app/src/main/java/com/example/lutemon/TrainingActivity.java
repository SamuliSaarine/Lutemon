package com.example.lutemon;

import androidx.appcompat.app.AppCompatActivity;

import android.appwidget.AppWidgetHostView;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TrainingActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        //radioGroup=findViewById(R.id.);
    }

    public void trainAttack(View view)
    {
        RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        TrainingField.trainAttack(radioGroup.indexOfChild(radioButton));
    }
}