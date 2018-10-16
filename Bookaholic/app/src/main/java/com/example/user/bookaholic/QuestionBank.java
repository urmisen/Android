package com.example.user.bookaholic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Focal length of plane mirror is ........",
            "2. Image formed by plane mirror is ........",
            "3. A concave mirror gives real,inverted and same size image if the object is placed at.......",
            "4. If the power of the lens is -40 then its focal length is .........",
    };
    private String multipleChoice [][] = {
            {"at infinity", "at zero","at focus","None of this"},
            {"Real & inverted", "Virtual & erect","Real & erect","Virtual & inverted"},
            {"Focus C", "Beyond Focus C","infinity","None of this"},
            {"-0.25","0.25","0.05","-0.05"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"at infinity", "Virtual & erect", "Focus,C", "-0.25","Optical dencer"};

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

    // array of multiple choices for each

