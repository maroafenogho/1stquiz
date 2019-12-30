package com.example.quizme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked
     */
    public void score(View view) {
        int baseScore = 0;
        RadioButton number1 = findViewById(R.id.radio_react);
        boolean react = number1.isChecked();
        if (react) {
            baseScore = baseScore + 5;
        }
        RadioButton number2 = findViewById(R.id.thirtyEight);
        boolean thirtyEight = number2.isChecked();
        if (thirtyEight) {
            baseScore = baseScore + 5;
        }
        CheckBox number3a = findViewById(R.id.sunflower_oil);
        CheckBox number3b = findViewById(R.id.coconut_oil);
        CheckBox number3c = findViewById(R.id.almond_oil);
        CheckBox number3d = findViewById(R.id.palm_oil);
        boolean question3 = number3a.isChecked() && !number3b.isChecked() && number3c.isChecked() && !number3d.isChecked();
        if (question3) {
            baseScore = baseScore + 5;
        }
        EditText numberFour = findViewById(R.id.answer4);
        String answerFour = numberFour.getText().toString().trim();
        if (answerFour.equals("discounting")) {
            baseScore = baseScore + 5;
        }
        CheckBox numberFive = findViewById(R.id.hard_oil);
        CheckBox numberFiveB = findViewById(R.id.olive_oil);
        CheckBox numberFiveC = findViewById(R.id.stearic_acid);
        CheckBox numberFiveD = findViewById(R.id.cure_time);
        boolean answerFive = numberFive.isChecked() && numberFiveB.isChecked() && numberFiveC.isChecked() && !numberFiveD.isChecked();
        if (answerFive) {
            baseScore = baseScore + 5;
        }
        RadioButton numberSix = findViewById(R.id.is_false);
        boolean sixFalse = numberSix.isChecked();
        if (sixFalse) {
            baseScore = baseScore + 5;
        }
        int score = baseScore;

        Toast toast = Toast.makeText(this, "Thank you for participating. Your score is " + score + " out of 30", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
