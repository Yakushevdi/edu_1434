package com.example.androidlesson12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button yesBtn;
    private Button noBtn;

    private TextView textView;

    private Question[] questions = new Question[]{
            new Question(R.string.question1,true),
            new Question(R.string.question2,false),
            new Question(R.string.question3,false),
            new Question(R.string.question4,true),
            new Question(R.string.question5,true)
    };

    private int questionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        yesBtn = findViewById(R.id.yesBtn);

        textView.setText(questions[questionIndex].getQuestionResId());

        yesBtn.setOnClickListener(new View.OnClickListener() { //ожидание клика на кнопки ДА
            @Override
            public void onClick(View view) {
                if (questions[questionIndex].isAnswerTrue())
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_SHORT ).show();
                else
                    Toast.makeText(MainActivity.this, R.string.incorrect,Toast.LENGTH_SHORT);
                questionIndex++;
                textView.setText(questions[questionIndex].getQuestionResId());
                }
        });

        noBtn = findViewById(R.id.noBtn);
        noBtn.setOnClickListener(new View.OnClickListener() { //ожидание клика на кнопки НЕТ
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();

            }
        });
    }
}