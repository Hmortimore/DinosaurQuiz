package com.hmortimore.dinosaurquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;
    EditText playerName;
    RadioButton q1RadioButton4;
    RadioButton q2RadioButton4;
    RadioButton q3RadioButton1;
    Button q4Image3;
    CheckBox q5CheckBox1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // submit the quiz for scoring
    public void calculateScore(View view) {


        // get player's name
        EditText playerName;
        playerName = findViewById(R.id.playerName);
        String playerName = playerName.getText().toString();


        //identify correct answers
        RadioButton q1RadioButton;
        q1RadioButton = findViewById(R.id.q1RadioButton4);
        boolean q1RadioButton4IsChecked = q1RadioButton.isChecked();

        RadioButton q2RadioButton;
        q2RadioButton = findViewById(R.id.q2RadioButton4);
        boolean q2RadioButton4IsChecked = q2RadioButton.isChecked();

        RadioButton q3RadioButton;
        q3RadioButton = findViewById(R.id.q3RadioButton1);
        boolean q3RadioButton1IsChecked = q3RadioButton.isChecked();

        Button q4Button;
        q4Button = findViewById(R.id.q4Image3);
        boolean q4Image3IsChecked = q4Button.isSelected();

        CheckBox q5CheckBox_1;
        q5CheckBox_1 = findViewById(R.id.q5CheckBox1);
        boolean q5CheckBox1IsChecked = q5CheckBox_1.isSelected();

        CheckBox q5CheckBox_2;
        q5CheckBox_2 = findViewById(R.id.q5CheckBox1);
        boolean q5CheckBox4IsChecked = q5CheckBox_2.isSelected();


        double totalScore = calculateScore(
                q1RadioButton4IsChecked,
                q2RadioButton4IsChecked,
                q3RadioButton1IsChecked,
                q4Image3IsChecked,
                q5CheckBox1IsChecked,
                q5CheckBox4IsChecked,
                );

    }

        // Display score and message
        private String displayMessage(String playerName, double totalScore) {
            String scoreMessage = playerName;
            scoreMessage = "Congrats" + playerName + totalScore + " out of 5 possible points!", Toast.LENGTH_LONG);
    }


    // Calculate the score
    private double calculateScore(
            boolean q1RadioButton4IsChecked,
            boolean q2RadioButton4IsChecked,
            boolean q3RadioButton1IsChecked,
            boolean q4Image3IsChecked,
            boolean q5CheckBox1IsChecked,
            boolean q5CheckBox4IsChecked,

        {

            if (q1RadioButton4IsChecked) {
                totalScore=totalScore+1;
            }
            if (q2RadioButton4IsChecked) {
                totalScore=totalScore+1;
            }
            if (q3RadioButton1IsChecked) {
                totalScore=totalScore+1;
            }
            if (q4Image3IsChecked) {
                totalScore=totalScore+1;
            }
            if (q5CheckBox1IsChecked) {
                totalScore=totalScore+1;
            }
            if (q5CheckBox4IsChecked) {
                totalScore=totalScore+1;
            }
            return totalScore;
        }
}
