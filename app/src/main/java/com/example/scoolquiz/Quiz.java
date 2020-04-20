package com.example.scoolquiz;

class Quiz
{
    private String[] questions0 = {"Who sang 'No woman no cry'?\nA: Michael Jackson\nB: Lucky Dube\nC: Bob Marley",
            "What's the name of the German who co-founded Calculus?\nA: Isaac Newton\nB: Albert Einstein\nC: Gottfried Leibniz\n",
            "Which year America declared their independence?\nA: 1776\nB: 1775\nC: 1667\n", "20% of $3500 is = \nA: $350\nB: $0.35\nC: $700\n",
            "170 is what percent of 200?\nA: 30%\nB: 65%\nC: 80%"};
    private String[] answers0 = {"C", "C", "A", "C", "B"};
    private String[] questions1;//add questions for 1
    private String[] answer1; // add answers for 1
    //add more questions and answers depending on user spinner selection
    private int quizLevel;
    Quiz(int quizLevel)
    {
        this.quizLevel = quizLevel;
    }
    public String getQuestion0(int index)
    {
        return questions0[index];
    }
    public String getAnswer0(int index)
    {        return answers0[index];
    }

    public String[] getQuestions0() {
        return questions0;
    }

    public void setQuestions0(String[] questions) {
        this.questions0 = questions;
    }
    public int getQuestion0Number()
    {
        return questions0.length;
    }

    //add more methods for other questions and answers based on user spinner selection
}
