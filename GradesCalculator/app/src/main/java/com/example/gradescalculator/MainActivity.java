package com.example.gradescalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xml to java connection
        EditText Quiz = findViewById(R.id.Quiz);
        EditText Homework = findViewById(R.id.Homework);
        EditText Midterm = findViewById(R.id.Midterm);
        EditText Finals = findViewById(R.id.Finals);
        TextView Result = findViewById(R.id.Result);
        Button button = findViewById(R.id.button);
        Button Rest = findViewById(R.id.Rest);

        // Activating the Calculate Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //When the button is clicked do the following
            public void onClick(View v) {
                double Total;
                // Take the input from Edit Text convert it to string
              String QuizGrade = Quiz.getText().toString();
              String HomeworkGrade =Homework.getText().toString();
              String MidtermGrade =Midterm.getText().toString();
              String FinalsGrade =Finals.getText().toString();

               // converting string into double
                Double.parseDouble(QuizGrade);
                Double.parseDouble(HomeworkGrade);
                Double.parseDouble(MidtermGrade);
                Double.parseDouble(FinalsGrade);
                
                // Adding the inputs to calculate the final grade
                Total = Double.parseDouble(QuizGrade) + Double.parseDouble(HomeworkGrade)
               + Double.parseDouble(MidtermGrade) + Double.parseDouble(FinalsGrade);


                if (Total<0 | Total> 100){
                    Result.setText("Invalid Input !");
                }else if ( Total >= 90 ){
                    Result.setText("Congrats you got an A");
                }else if (Total >= 80 && Total <= 89){
                    Result.setText("Excellent Job you got a B");
                }else if (Total >= 70 && Total <= 79){
                    Result.setText("Good Job you got a C");
                }else if (Total >= 60 && Total <= 69){
                    Result.setText("Poor Job you got a D");
                }else{
                    Result.setText("You have failed the Course");}

            }
        });
        // Activating the Rest Button
        Rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when the rest button is clicked all the edit text fields will be cleared
                Quiz.getText().clear();
                Homework.getText().clear();
                Midterm.getText().clear();
                Finals.getText().clear();
                Result.setText(null);


            }
        });



    }
}
