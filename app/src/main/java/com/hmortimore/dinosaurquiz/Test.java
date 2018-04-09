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

public class Test {

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
            boolean choiceForQuestion4 = q4Image3.isChecked();


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

        public void onRadioButtonInQ1Clicked(View view) {

            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()) {
                case R.id.answer_1_question_1:
                    if (checked)

                        break;
                case R.id.answer_2_question_1:
                    if (checked)

                        break;
                case R.id.answer_3_question_1:
                    if (checked)

                        break;

                case R.id.answer_4_question_1:
                    if (checked)

                        break;

            }
        }

        public void onRadioButtonInQ2Clicked(View view) {

            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()) {
                case R.id.answer_1_question_2:
                    if (checked)

                        break;
                case R.id.answer_2_question_2:
                    if (checked)

                        break;
                case R.id.answer_3_question_2:
                    if (checked)

                        break;

                case R.id.answer_4_question_2:
                    if (checked)

                        break;

            }
        }

        public void onRadioButtonInQ3Clicked(View view) {

            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()) {
                case R.id.answer_1_question_3:
                    if (checked)

                        break;
                case R.id.answer_2_question_3:
                    if (checked)

                        break;
                case R.id.answer_3_question_3:
                    if (checked)

                        break;

                case R.id.answer_4_question_3:
                    if (checked)

                        break;

            }
        }

        public void onRadioButtonInQ4Clicked(View view) {

            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()) {
                case R.id.answer_1_question_4:
                    if (checked)

                        break;
                case R.id.answer_2_question_4:
                    if (checked)

                        break;
                case R.id.answer_3_question_4:
                    if (checked)

                        break;

                case R.id.answer_4_question_4:
                    if (checked)

                        break;

            }
        }

        // Display the score on the screen
        String scoreMessage = createScoreMessage(playerName, answersCorrect);
        displayMessage(scoreMessage);


        // Reset the quiz

        public void resetTheQuiz(View view) {

            if (playerName != null)
                playerName.setText("");
            else {
                playerName = (EditText) findViewById(R.id.playerName);
                playerName.setText("");
            }

            if (answer_1_question_6 != null)
                answer_1_question_6.setChecked(false);
            else {
                answer_1_question_6 = (CheckBox) findViewById(R.id.answer_1_question_6);
                answer_1_question_6.setChecked(false);
            }

            if (answer_2_question_6 != null)
                answer_2_question_6.setChecked(false);
            else {
                answer_2_question_6 = (CheckBox) findViewById(R.id.answer_2_question_6);
                answer_2_question_6.setChecked(false);
            }


            if (answer_3_question_6 != null)
                answer_3_question_6.setChecked(false);
            else {
                answer_3_question_6 = (CheckBox) findViewById(R.id.answer_3_question_6);
                answer_3_question_6.setChecked(false);
            }

            if (answer_4_question_6 != null)
                answer_4_question_6.setChecked(false);
            else {
                answer_4_question_6 = (CheckBox) findViewById(R.id.answer_4_question_6);
                answer_4_question_6.setChecked(false);
            }

            RadioGroup q1RadioGroup = (RadioButton) findViewById(R.id.choices_For_Question1);
            q1RadioGroup.clearCheck();

            RadioGroup q2RadioGroup = (RadioButton) findViewById(R.id.choices_For_Question2);
            q2RadioGroup.clearCheck();

            RadioGroup q3RadioGroup = (RadioButton) findViewById(R.id.choices_For_Question3);
            q3RadioGroup.clearCheck();

            RadioGroup q4GridLayout = (GridLayout) findViewById(R.id.choices_For_Question4);
            q4GridLayout.clearCheck();

            Toast toast = Toast.makeText(getApplicationContext(), "Quiz Reset!", Toast.LENGTH_LONG);
            toast.show();

        }
    }

}
