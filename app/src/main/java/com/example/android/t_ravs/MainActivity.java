package com.example.android.t_ravs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int numberEaten = 0;
    int calories = 0;
    double cost = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addCaloriesAndCost(View v) {
        numberEaten++;
        calories += 60;
        cost += 16;
        displayForNumberEaten(numberEaten);
        displayForCalories(calories);
        displayForCost(cost);
    }

    public void reset(View v) {
        numberEaten = 0;
        calories = 0;
        cost = 0;
        displayForNumberEaten(numberEaten);
        displayForCalories(calories);
        displayForCost(cost);
    }

    public void displayForNumberEaten(int numberEaten) {
        TextView numberView = (TextView) findViewById(R.id.numberEaten);
        numberView.setText(String.valueOf(numberEaten));
    }

    public void displayForCalories(int calories) {
        TextView caloriesView = (TextView) findViewById(R.id.calories);
        caloriesView.setText(String.valueOf(calories));
    }

    public void displayForCost(double cost) {
        TextView costView = (TextView) findViewById(R.id.cost);
        costView.setText(NumberFormat.getCurrencyInstance().format(cost / 100));
    }
}
