package com.example.scoolquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner levelSpinner, departmentSpinner, sessionSpinner, semesterSpinner;
    private String level;
    private String semester;
    private String department;
    private String session;
    private Button submitButton;
    private static final String[] levels = {"100", "200", "300", "400", "500"};
    private static final String[] semesters = {"First semester", "Second semester"};
    private static final String[] departments = {"Mathematics", "Computer Science", "Physics", "...", "English", "Chemistry"};
    private static final String[] sessions = {"1992/1993", "1993/1994", "1994/1995", "...", "2018/2019", "2019/2020"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        levelSpinner = findViewById(R.id.level_spinner);
        departmentSpinner = findViewById(R.id.dept_spinner);
        semesterSpinner = findViewById(R.id.semester_spinner);
        sessionSpinner = findViewById(R.id.session_spinner);
        submitButton = findViewById(R.id.submit_button);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item, levels);

        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        levelSpinner.setAdapter(adapter1);
        levelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        level = levels[0];
                        break;
                    case 1:
                        level = levels[1];
                        break;
                    case 2:
                        level = levels[2];
                        break;
                    case 3:
                        level = levels[3];
                        break;
                    case 4:
                        level = levels[4];
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item, departments);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        departmentSpinner.setAdapter(adapter2);
        departmentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        department = departments[0];
                        break;
                    case 1:
                        department = departments[1];
                        break;
                    case 2:
                        department = departments[2];
                        break;
                    case 3:
                        department = departments[3];
                        break;
                    case 4:
                        department = departments[4];
                        break;
                    case 5:
                        department = departments[5];
                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item, semesters);

        adapter3.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        semesterSpinner.setAdapter(adapter3);
        semesterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        semester = semesters[0];
                        break;
                    case 1:
                        semester = semesters[1];
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_item, sessions);

        adapter4.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        sessionSpinner.setAdapter(adapter4);
        sessionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        session = sessions[0];
                        break;
                    case 1:
                        session = sessions[1];
                        break;
                    case 2:
                        session  = sessions[2];
                        break;
                    case 3:
                        session  = sessions[3];
                        break;
                    case 4:
                        session  = sessions[4];
                        break;
                    case 5:
                        session  = sessions[5];
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
                Intent quizIntent = new Intent(MainActivity.this, QuizActivity.class);
                quizIntent.putExtra("quiz", 0);//quiz intent, the value o can be for the current
                //user selection, you can add more values based on different selections
                startActivity(quizIntent);
            }
        });
    }
}
