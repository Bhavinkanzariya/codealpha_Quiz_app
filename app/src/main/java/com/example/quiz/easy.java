package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.HeterogeneousExpandableList;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class easy extends AppCompatActivity {

    TextView question,opt1,opt2,opt3,opt4,timer,question_number;
    LinearLayout opt1Ans,opt2ans,opt3ans,opt4ans;
    Boolean ansIs;
    int currenrposition = 0;
    int currenrans =0;

    private final List<QuizList> quizLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        question = findViewById(R.id.question);

        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);

        opt1Ans = findViewById(R.id.opt1Ans);
        opt2ans = findViewById(R.id.opt2ans);
        opt3ans = findViewById(R.id.opt3ans);
        opt4ans = findViewById(R.id.opt4ans);

        timer = findViewById(R.id.timer);
        question_number = findViewById(R.id.question_number);

        quizLists.addAll(QuizData.getQuiz());

        setText();
        question_number.setText(String.valueOf(currenrposition+1));

        new CountDownTimer(50000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("" + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(),resultshow.class);
                startActivity(intent);

            }
        }.start();

        opt1Ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String option1 = opt1.getText().toString();

                if (option1.equals(quizLists.get(currenrposition).getAns())){
                    ansIs = true;
                    currenrans++;
                }else {
                    ansIs = false;
                }

                if (ansIs){
                    opt1Ans.setBackgroundColor(Color.GREEN);
                }else {
                    opt1Ans.setBackgroundColor(Color.RED);
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currenrposition++;

                        opt1Ans.setBackgroundColor(Color.WHITE);
                        opt2ans.setBackgroundColor(Color.WHITE);
                        opt3ans.setBackgroundColor(Color.WHITE);
                        opt4ans.setBackgroundColor(Color.WHITE);

                        if (currenrposition <=4){
                            setText();
                            question_number.setText(String.valueOf(currenrposition+1));
                        }else {
                            Intent intent = new Intent(getApplicationContext(),resultshow.class);
                            intent.putExtra("currect",currenrans);
                            startActivity(intent);
                        }
                    }
                },1000);
            }
        });
        opt2ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String option1 = opt2.getText().toString();

                if (option1.equals(quizLists.get(currenrposition).getAns())){
                    ansIs = true;
                    currenrans++;
                }else {
                    ansIs = false;
                }

                if (ansIs){
                    opt2ans.setBackgroundColor(Color.GREEN);
                }else {
                    opt2ans.setBackgroundColor(Color.RED);
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currenrposition++;

                        opt1Ans.setBackgroundColor(Color.WHITE);
                        opt2ans.setBackgroundColor(Color.WHITE);
                        opt3ans.setBackgroundColor(Color.WHITE);
                        opt4ans.setBackgroundColor(Color.WHITE);

                        if (currenrposition <=4){
                            setText();
                            question_number.setText(String.valueOf(currenrposition+1));
                        }else {
                            Intent intent = new Intent(getApplicationContext(),resultshow.class);
                            intent.putExtra("currect",currenrans);
                            startActivity(intent);
                        }
                    }
                },1000);
            }
        });
        opt3ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String option1 = opt3.getText().toString();

                if (option1.equals(quizLists.get(currenrposition).getAns())){
                    ansIs = true;
                    currenrans++;
                }else {
                    ansIs = false;
                }

                if (ansIs){
                    opt3ans.setBackgroundColor(Color.GREEN);
                }else {
                    opt3ans.setBackgroundColor(Color.RED);
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currenrposition++;

                        opt1Ans.setBackgroundColor(Color.WHITE);
                        opt2ans.setBackgroundColor(Color.WHITE);
                        opt3ans.setBackgroundColor(Color.WHITE);
                        opt4ans.setBackgroundColor(Color.WHITE);

                        if (currenrposition <=4){
                            setText();
                            question_number.setText(String.valueOf(currenrposition+1));
                        }else {
                            Intent intent = new Intent(getApplicationContext(),resultshow.class);
                            intent.putExtra("currect",currenrans);
                            startActivity(intent);
                        }
                    }
                },1000);
            }
        });
        opt4ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String option1 = opt4.getText().toString();

                if (option1.equals(quizLists.get(currenrposition).getAns())){
                    ansIs = true;
                    currenrans++;
                }else {
                    ansIs = false;
                }

                if (ansIs){
                    opt4ans.setBackgroundColor(Color.GREEN);
                }else {
                    opt4ans.setBackgroundColor(Color.RED);
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        currenrposition++;

                        opt1Ans.setBackgroundColor(Color.WHITE);
                        opt2ans.setBackgroundColor(Color.WHITE);
                        opt3ans.setBackgroundColor(Color.WHITE);
                        opt4ans.setBackgroundColor(Color.WHITE);

                        if (currenrposition <=4){
                            setText();
                            question_number.setText(String.valueOf(currenrposition+1));
                        }else {
                            Intent intent = new Intent(getApplicationContext(),resultshow.class);
                            intent.putExtra("currect",currenrans);
                            startActivity(intent);
                        }
                    }
                },1000);
            }
        });

    }

    private void setText(){
        question.setText(quizLists.get(currenrposition).getQuestion());
        opt1.setText(quizLists.get(currenrposition).getOpt1());
        opt2.setText(quizLists.get(currenrposition).getOpt2());
        opt3.setText(quizLists.get(currenrposition).getOpt3());
        opt4.setText(quizLists.get(currenrposition).getOpt4());
    }
}