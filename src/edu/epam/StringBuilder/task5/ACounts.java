package edu.epam.StringBuilder.task5;

//      Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

import java.util.*;
import java.util.regex.*;

public class ACounts {

    public static void main(String[] args) {

//        Create class example:

        ACounts aCounts = new ACounts();
        aCounts.enteredString();
    }

    private void enteredString() {

//        Create local variables:

        String userInput = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Please, enter your expression with \"a\" on a board: ");

//        Find exceptions:

        try {
            userInput = scn.nextLine();
            scn.close();

        } catch(InputMismatchException ex1) {

            System.out.println("Amazing! Everything was crashed!");
        }

        aCounter(userInput);
    }

    private void aCounter(String someWords) {

//        Declare local variables:

        int counter = 0;
        Pattern pattern =Pattern.compile("[a]");
        Matcher match = pattern.matcher(someWords);

        while (match.find()) {

            counter += 1;
        }

        output(counter);
    }

    private void output(int resultVariable) {

//        Output result:
        
        System.out.println("After long and hard counting we find, that your sentence has " + resultVariable + " chars \"a\"");
    }
}
