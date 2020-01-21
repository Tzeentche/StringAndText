package edu.epam.StringBuilder.task10;

//      Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным
//      или вопросительным знаком. Определить количество предложений в строке X.

import java.util.*;

public class StringX {

    public static void main(String[] args) {

        StringX stringX = new StringX();
        stringX.someText();
    }

    private void someText() {

        String usersText = "";
        Scanner scn = new Scanner(System.in);

        try {

            usersText = scn.nextLine();
            scn.close();

        } catch (InputMismatchException ex1) {

            System.out.println("You done something wrong...");
        }

        dotsCounter(usersText);
    }

    private void dotsCounter(String insertExpression) {

    }

    private void resultOutput() {

    }
}
