package AddWordServices;

import AppToLearn.NewsWord;

import java.util.Scanner;

public class AddingWord {

    public Scanner add = new Scanner(System.in);

    //Adding a new word

    public NewsWord[] enterNewWords(int numWords) {
        NewsWord[] userWords = new NewsWord[numWords];

        for (int i = 0; i < numWords; i++) {
            System.out.println("Enter the word you want to learn:");
            String word = add.nextLine();
            System.out.println("Enter the meaning:");
            String meaning = add.nextLine();
            System.out.println("Enter the phonetic symbol:");
            Character phoneticSymbol = add.next().charAt(0);
            add.nextLine();
            System.out.println("Enter examples:");
            String examples = add.nextLine();

            userWords[i] = new NewsWord(word, meaning, phoneticSymbol, examples);
        }

        return userWords;
    }


}
