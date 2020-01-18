package edu.epam.StringBuilder.task6;

//      Из заданной строки получить новую, повторив каждый символ дважды.

import java.util.*;
import java.util.regex.*;

public class DoubleSimbols {

    public static void main(String[] args) {

        DoubleSimbols doubleSimbols = new DoubleSimbols();
        doubleSimbols.enteredString();
    }

    private void enteredString() {

        String someText = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Please, enter your text!");

        try {

            someText = scn.nextLine();
            scn.close();

        } catch(InputMismatchException ex1) {

            System.out.println("You was broken everything!");
        }

        separator(someText);
    }

    private void separator(String usersInput) {

        String[] charsArray = usersInput.split("");
        System.out.println("Here we have next result: " + charsArray);

        doubleFunction(charsArray);
    }

    private void doubleFunction(String[] datasArray) {

        String[] resultExpression = new String[(datasArray.length * 2)];

        for(int counter = 0; counter < datasArray.length; counter++) {

            Pattern pattern = Pattern.compile("[.]");
            Matcher match = pattern.matcher(datasArray[counter]);

            if (match.find()) {

                
            }
        }
    }

    private void output() {

    }
}
