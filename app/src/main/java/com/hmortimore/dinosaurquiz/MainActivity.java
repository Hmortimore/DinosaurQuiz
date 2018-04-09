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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // set quiz score to 0
    int correctAnswers = 0;
    EditText playerName;
    RadioButton q1RadioButton4;
    RadioButton q2RadioButton4;
    RadioButton q3RadioButton1;
    Button q4Image3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText playerName = (EditText) findViewById(R.id.enter_name);
    }

    //identify correct answers

    public void answerCheck(View v) {
        playerName = (EditText) findViewById(R.id.playerName);
        String usersName = playerName.getText().toString();

        q1RadioButton4 = (RadioButton) findViewById(R.id.q1RadioButton4);
        boolean choiceForQuestion1 = q1RadioButton4.isChecked();

        q2RadioButton4 = (RadioButton) findViewById(R.id.q2RadioButton4);
        boolean choiceForQuestion2 = q2RadioButton4.isChecked();

        q3RadioButton1 = (RadioButton) findViewById(R.id.q3RadioButton1);
        boolean choiceForQuestion3 = q3RadioButton1.isChecked();

        q4Image3 = (Button) findViewById(R.id.q4Image3);
        boolean choiceForQuestion4 = q4Image3.isSelected()


        correctAnswers = scoreCalculated(choiceForQuestion1, choiceForQuestion2, choiceForQuestion3, choiceForQuestion4);

        Toast toast = Toast.makeText(getApplicationContext(), "Congrats " + playerName + "! Your score is " + correctAnswers + " out of 4 possible points!", Toast.LENGTH_LONG);
        toast.show();
    }

    public int scoreCalculated(boolean choiceForQuestion1, boolean choiceForQuestion2, boolean choiceForQuestion3, boolean choiceForQuestion4, boolean choiceForQuestion5, boolean checkedOrNotChoice1, boolean checkedOrNotChoice2, boolean checkedOrNotChoice3, boolean checkedOrNotChoice4, boolean choiceForQuestion7, boolean choiceForQuestion8) {
        int answersCorrect = 0;

        if (choiceForQuestion1 == true)
            answersCorrect += 1;

        if (choiceForQuestion2 == true)
            answersCorrect += 1;

        if (choiceForQuestion3 == true)
            answersCorrect += 1;

        if (choiceForQuestion4 == true)
            answersCorrect += 1;

        return answersCorrect;
    }

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

    double totalScore = calculateScore(
            q1RadioButton4IsChecked,
            q2RadioButton4IsChecked,
            q3RadioButton1IsChecked,
            q4Image3IsChecked,
    );


    // Display the score on the screen
    String scoreMessage = createScoreMessage(playerName, answersCorrect);
    displayMessage(scoreMessage);


        //original java code - HM - Reset the Quiz

        RadioGroup q1RadioGroup = (RadioButton) findViewById(R.id.q1RadioGroup);
        q1RadioGroup.

        RadioGroup q2RadioGroup = (RadioButton) findViewById(R.id.q2RadioGroup);
        q2RadioGroup.clearCheck();

        RadioGroup q3RadioGroup = (RadioButton) findViewById(R.id.q3RadioGroup);
        q3RadioGroup.clearCheck();

        RadioGroup q4GridLayout = (GridLayout) findViewById(R.id.q4GridLayout);
        q4GridLayout.clearCheck();

        Toast toast = Toast.makeText(getApplicationContext(), "Quiz Reset!", Toast.LENGTH_LONG);
        toast.show();

    }
}
