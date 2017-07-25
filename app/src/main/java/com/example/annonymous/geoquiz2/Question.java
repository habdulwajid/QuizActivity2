package com.example.annonymous.geoquiz2;

/**
 * Created by Annonymous on 7/23/2017.
 */
public class Question {

//    this is Model Class According to MVC

    public Question(int textResId, boolean anserTrue){
        mTextResId = textResId;
        mAnswerTrue = anserTrue;
    }

    private  int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
