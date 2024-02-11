package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizData {
    public static List<QuizList> getQuiz(){
        final List<QuizList> quizLists1 = new ArrayList<>();

        QuizList quiz1 = new QuizList("Where is taj mahel?","Delhi","Agra","Gujarat","Mumbai","Agra");
        quizLists1.add(quiz1);

        QuizList quiz2 = new QuizList("Where is Burj khalifa?","Delhi","Agra","Gujarat","Dubai","Dubai");
        quizLists1.add(quiz2);

        QuizList quiz3 = new QuizList("Where is lal kilo?","Delhi","Agra","Gujarat","Dubai","Delhi");
        quizLists1.add(quiz3);

        QuizList quiz4= new QuizList("5+102=?","120","150","130","107","107");
        quizLists1.add(quiz4);

        QuizList quiz5= new QuizList("who is india PM?","yogi","Narendar Modi","vijay Rupani","Kejrival","Narendar Modi");
        quizLists1.add(quiz5);


        return  quizLists1;
    }
    public static List<QuizList> getnormal(){
        final List<QuizList> quizLists1 = new ArrayList<>();

        QuizList quiz1 = new QuizList("Where is taj mahel?","Delhi","Agra","Gujarat","Mumbai","Agra");
        quizLists1.add(quiz1);

        QuizList quiz2 = new QuizList("Where is Burj khalifa?","Delhi","Agra","Gujarat","Dubai","Dubai");
        quizLists1.add(quiz2);

        QuizList quiz3 = new QuizList("Where is lal kilo?","Delhi","Agra","Gujarat","Dubai","Delhi");
        quizLists1.add(quiz3);

        QuizList quiz4= new QuizList("5+102=?","120","150","130","107","107");
        quizLists1.add(quiz4);

        QuizList quiz5= new QuizList("who is india PM?","yogi","Narendar Modi","vijay Rupani","Kejrival","Narendar Modi");
        quizLists1.add(quiz5);


        return  quizLists1;
    }
}
