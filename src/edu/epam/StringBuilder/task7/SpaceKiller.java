package edu.epam.StringBuilder.task7;

//      Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например,
//      если было введено "abc cde def", то должно быть выведено "abcdef".

import java.util.*;

public class SpaceKiller {

    public static void main(String[] args) {


        SpaceKiller spaceKiller = new SpaceKiller();
        spaceKiller.newSentence();
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
