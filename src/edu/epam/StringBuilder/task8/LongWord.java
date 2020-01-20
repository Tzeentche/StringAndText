package edu.epam.StringBuilder.task8;

//      Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
//      Случай, когда самых длинных слов может быть несколько, не обрабатывать.

import java.util.*;

public class LongWord {

    public static void main(String[] args) {

        LongWord longWord = new LongWord();
        longWord.usersText();
    }

    private void usersText() {

        String text = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your text, please:");

        try {

            text = scn.nextLine();
            scn.close();

        } catch (InputMismatchException ex1) {

            System.out.println("Something going wrong...");
        }

        charsSplitter(text);
    }

    private void charsSplitter(String inputText) {


        String[] textArray = inputText.split("[ ]");

        charsCounter(textArray);
    }
    private void charsCounter(String[] usersTextArray) {

        int textLength = usersTextArray[0].length();
        String theLongestWord = "";

        for (int counter = 0; counter < usersTextArray.length; counter ++) {

            if (textLength <= usersTextArray[counter].length()) {

                textLength = usersTextArray[counter].length();
                theLongestWord = usersTextArray[counter];
            }
        }

        outputter(theLongestWord);
    }

    private void outputter(String result) {

        System.out.println("The most long word is " + result + " ! EE!");
    }
}
