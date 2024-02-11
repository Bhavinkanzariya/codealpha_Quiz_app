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
    public static List<QuizList> getnormal() {
        final List<QuizList> quizLists1 = new ArrayList<>();

        QuizList quiz1 = new QuizList("What does KFC stand for?", "Kentucky Fried Chicken", "Kentucky friend Chicken", "Kentucky Fried china", "kite Fried Chicken", "Kentucky Fried Chicken");
        quizLists1.add(quiz1);

        QuizList quiz2 = new QuizList("In what year did the Berlin Wall fall?", "1990", "1989", "1851", "1987", "1989");
        quizLists1.add(quiz2);

        QuizList quiz3 = new QuizList("Who founded Amazon?", "m.p.shash", "dhoni", "jeff bezos", "khohli", "jeff bezos");
        quizLists1.add(quiz3);

        QuizList quiz4 = new QuizList("On what date is Independence Day in the USA?", "12 may", "15 july", "13 march", "4 july", "4 july");
        quizLists1.add(quiz4);

        QuizList quiz5 = new QuizList("What is a female donkey called?", " A hony", "A jenny", "A nony", "A juny", "A jenny");
        quizLists1.add(quiz5);

        return  quizLists1;

    }

        public static List<QuizList> gethard(){
            final List<QuizList> quizLists1 = new ArrayList<>();

            QuizList quiz1 = new QuizList("Who is Liverpool Airport named after?","John jah","John Lennon","John liaano","John weak","John Lennon");
            quizLists1.add(quiz1);

            QuizList quiz2 = new QuizList("What is the holy book of Judaism?","Torah","weak","non these","Panda","Torah");
            quizLists1.add(quiz2);

            QuizList quiz3 = new QuizList("What does USB stand for?","Delhi","Agra","Universal serial bus","Dubai","Universal serial bus");
            quizLists1.add(quiz3);

            QuizList quiz4= new QuizList("In what year was The Gunpowder Plot?","1605","1500","1608","1650","1605");
            quizLists1.add(quiz4);

            QuizList quiz5= new QuizList("Which sea borders the north of Turkey?","white sea","Black Sea","red sea","blue sea","Black Sea");
            quizLists1.add(quiz5);


        return  quizLists1;
    }
}
