package com.example.scoolquiz;

public class QuizQuestions
{
    private Quiz quiz;
    private int quizLevel;
    public String question;
    public String answer;
    private static int index = 0;
    public int numberOfQuestions = 5;//you modify this and get the number from the dataset
    public QuizQuestions(int quizLevel)
    {
        this.quizLevel = quizLevel;
        quiz = new Quiz(quizLevel);
    }
    public void start()
    {
        switch (quizLevel)
        {
            case 0:
                startLevel0();
            case 1:
                //TODO by you
                break;
            case 2:
                //
                break;
            case 3:
                //
                break;
            case 4:
                //
                break;
            case 5:
                //
                break;
            case 6:
                //
                break;
            case 7:
                //
                break;
            case 8:
                //
                break;
            case 9:
                //
                break;
            case 10:
                //
                break;
        }
    }

    public void startLevel0()
    {
        question = quiz.getQuestion0(index);
        answer = quiz.getAnswer0(index);
        if(index < numberOfQuestions)
        {
            index ++;
        }else
        {
            //TODO: calculate user performance
        }
    }
    //add more methods for more levels
}
