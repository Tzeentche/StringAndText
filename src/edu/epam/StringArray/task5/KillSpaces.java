package edu.epam.StringArray.task5;

//      Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//      Крайние пробелы в строке удалить.

import java.util.*;

public class KillSpaces {

    public static void main(String[] args) {

    KillSpaces killSpaces = new KillSpaces();
    killSpaces.newSentence();
    }

    private void newSentence() {

        Scanner scn = new Scanner(System.in);
        String sentense = "";

        System.out.println("Please, enter your sentense: ");

        try {

            sentense = scn.nextLine();
            scn.close();

        } catch(InputMismatchException ex1) {

            System.out.println("You done something wrong, and broke it all.");
        }

        cloneKiller(sentense);
    }

    private void cloneKiller(String usersExpression) {


    }

    private void spaceKiller() {

    }

    private void outputResult() {

    }
}
