package edu.epam.StringBuilder.task9;

//      Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
//      Учитывать только английские буквы.

import java.util.*;

public class UpperLowerCase {

    public static void main(String[] args) {

        UpperLowerCase upperLowerCase = new UpperLowerCase();
        upperLowerCase.usersLine();
    }

    private void usersLine() {

        String innerLine = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Please, enter the line:");

        try {

            innerLine = scn.nextLine();
            scn.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Your parameters were insert broke all the system!");
        }

        lowerCounter(innerLine);
    }

    private void lowerCounter(String usersExpression) {

    }

    private void upperCounter() {

    }

    private void result() {

    }
}
