package com.example.deepa.quizapplication;



public class QuestionLibrary {
    private String mQuestions [] = {
            "What is called a fish with a snake like body?" ,
            "In which city is the oldest zoo in the world ?",
            "After which animals are the Canary Islands named ?",
            "What is the food of penguins?"
    };

    private String mChoices [][]= {
            {"Dogs","Cats","EalFish","Elephant"},
            {"China","Vienna","Scotland","India"},
            {"Dogs","Ants","Peacock","Eagle"},
            {"Rice","Bread","Ravioli","Plankton"}
    };

    private String mCorrectAnswers [] = {"EalFish","Vienna","Dogs","Plankton"};


    public String getQuestion(int a){
        String Questions=mQuestions[a];
        return Questions;
    };

    public String getChoice1(int a){
        String choice0=mChoices[a][0];
        return choice0;

    };


    public String getChoice2(int a){
        String choice1=mChoices[a][1];
        return choice1;

    };

    public String getChoice3(int a){
        String choice2=mChoices[a][2];
        return choice2;

    };

    public String getChoice4(int a){
        String choice3=mChoices[a][3];
        return choice3;

    };

    public String getCorrectAnswers(int a){
        String answer=mCorrectAnswers[a];
        return answer;

    };

    public int getLength(){
        return mQuestions.length;
    }

}




