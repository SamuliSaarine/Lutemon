package com.example.lutemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.nameInput);
    }

    public void addLutemon(View view)
    {
        Player.getInstance().addLutemon(nameInput.getText().toString());
    }

    public void openHome(View view)
    {
        Intent intent = new Intent(this, LutemonHomeActivity.class);
        startActivity(intent);
    }

    public void openTrain(View view)
    {
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);
    }
}