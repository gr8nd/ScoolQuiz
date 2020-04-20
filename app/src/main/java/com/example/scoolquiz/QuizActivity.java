package com.example.scoolquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
private int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//quiz levels, you can add more or remove
    private Button submitButton, startButton, restartButton;
    private Spinner optiosSpinner;
    TextView message, display;
    private static String[] options = {"A", "B", "C", "D"};
    private String userOption;
    private QuizQuestions questions;
    private static int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        submitButton = findViewById(R.id.submit_button);
        optiosSpinner = findViewById(R.id.options);
        message = findViewById(R.id.message);
        display = findViewById(R.id.question_display);
        startButton = findViewById(R.id.start_button);
        restartButton = findViewById(R.id.restart_button);
        final Intent intent = getIntent();
        int value = intent.getIntExtra("quiz", 0);

        switch (value)
        {
            case 0:
                questions = new QuizQuestions(0);
                break;
            case 1:
                questions = new QuizQuestions(1);
                break;
            case 2:
                questions = new QuizQuestions(2);
                break;
            case 3:
                questions = new QuizQuestions(3);
                break;
            case 4:
                questions = new QuizQuestions(4);
                break;
            case 5:
                questions = new QuizQuestions(5);
                break;
            case 6:
                questions = new QuizQuestions(6);
                break;
            case 7:
                questions = new QuizQuestions(7);
                break;
            case 8:
                questions = new QuizQuestions(8);;
                break;
            case 9:
                    questions = new QuizQuestions(9);
                    break;
            case 10:
                questions = new QuizQuestions(10);
                break;
        }
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(QuizActivity.this,
                android.R.layout.simple_spinner_item, options);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        optiosSpinner.setAdapter(adapter2);
        optiosSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        userOption = options[0];
                        break;
                    case 1:
                        userOption = options[1];
                        break;
                    case 2:
                        userOption = options[2];
                        break;
                    case 3:
                        userOption = options[3];
                        break;
                    case 4:
                        userOption = options[4];
                        break;
                    case 5:
                        userOption = options[5];
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }
        });
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index < questions.numberOfQuestions)
                {
                    start();
                }

                else
                {
                    display.setText(getString(R.string.end));
                }

            }
        });
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //You can implement the restart option if wish or remove it
            }
        });
    }
    public void start()
    {
        questions.start();
        display.setText(questions.question);
        index++;
    }
    public void submit()
    {
        if(index < questions.numberOfQuestions)
        {
            if(userOption.equals(questions.answer))
            {
                message.setText(getResources().getString(R.string.congrats_message));
            }else
            {
                message.setText(getResources().getString(R.string.failed_message));
            }
            display.setText("");
        }

    }

}
