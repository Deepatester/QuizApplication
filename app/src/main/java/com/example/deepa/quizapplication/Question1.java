package com.example.deepa.quizapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.view.LayoutInflater;
import android.content.Context;
import android.app.Activity;


public class Question1 extends MainActivity {


    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    //Declare Radio Buttons
    private RadioButton mRb0,mRb1,mRb2,mRb3,Answer1, Answer2, Answer3, Answer4, mRb;
    private RadioGroup mRg;
    private String RightAnswer1, SelectedAnswer1,mAnswer;
    private TextView mQTag,mQuestion,mAnsTag;
    private  int mQuestionNumber = 0,mScore=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        final TextView mQTag = (TextView) findViewById(R.id.que1);
        final TextView mQuestion = (TextView) findViewById(R.id.Actualquestion);
        final TextView mAnsTag = (TextView) findViewById(R.id.Answer);
        final RadioButton mRb0 = (RadioButton) findViewById(R.id.answer1);
        final RadioButton mRb1 = (RadioButton) findViewById(R.id.answer2);
        final RadioButton mRb2 = (RadioButton) findViewById(R.id.answer3);
        final RadioButton mRb3 = (RadioButton) findViewById(R.id.answer4);
        mRg = (RadioGroup) findViewById(R.id.rgGroup);

        mQTag.setText("Question");
        mQuestion.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mAnsTag.setText("Answer");
        mRb0.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mRb1.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mRb2.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mRb3.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
        mAnswer =mQuestionLibrary.getCorrectAnswers(mQuestionNumber) ;
        mQuestionNumber++;
        updateScore();


        //on click next Button
        Button Next = (Button) findViewById(R.id.nextButton);
        Next.setOnClickListener(new View.OnClickListener()

                                {
                                    public void onClick(View View) {


                                        if (mQuestionNumber < (mQuestionLibrary.getLength())) {
                                            mRg.clearCheck();
                                            mQTag.setText("Question");
                                            mQuestion.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
                                            mAnsTag.setText("Answer");
                                            mRb0.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
                                            mRb1.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
                                            mRb2.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
                                            mRb3.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
                                            mAnswer =mQuestionLibrary.getCorrectAnswers(mQuestionNumber) ;
                                            mQuestionNumber++;
                                            updateScore();
                                        }else{
                                            Intent myIntent1 = new Intent(Question1.this, finalpage.class);
                                            myIntent1.putExtra("Result",score);
                                            startActivity(myIntent1);
                                        }

                                    }
                                }
                                );
    }
//when selecting any radio button
     public void rbClick(View v) {
     int Selected_id = mRg.getCheckedRadioButtonId();
     mRb = (RadioButton) findViewById(Selected_id);
     SelectedAnswer1 = mRb.getText().toString();
     if (SelectedAnswer1 == mAnswer)
     {
     Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
     mScore = mScore + 1;
     } else
     {
     Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
   }
     }

public void updateScore(){
        score=mScore;
}

}

