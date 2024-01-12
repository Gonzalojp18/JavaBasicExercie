//import Central.Book;

//import Central.Circunferencia;

import AddWordServices.AddingWord;
import AppToLearn.NewsWord;
import Central.Rectangulo;

public class Main {

    public static void main(String[] args) {
        /*EJERCICIO DE LIBRO ************

        Book firstBook = new Book();
        firstBook.EnterBook();
        firstBook.showBook();

         */

        /*
        EJERCIIOS DE CIRCUNSFERENCIA ************

        Circunferencia lookCircu = new Circunferencia();
        lookCircu.CreateCircumference();
        lookCircu.area();
        lookCircu.perimetro();
         */

        //MODELACION DE RECTANGULO ************

        /*Rectangulo moldeRactangulo = new Rectangulo(15.30, 20.50);

        moldeRactangulo.CreateRectangulo();
        moldeRactangulo.CalSuperficie();
        moldeRactangulo.CalParaametro();  */

        //CREATING AN BASIC APP WHERE WE CAN ADD NEW WORD FROM TO LEARN ************

        AddingWord wordAdder = new AddingWord();

        System.out.print("Enter the number of words you want to add: ");

        while(!wordAdder.add.hasNextInt()){
            System.out.println("Only number is allowed, please try enter an number");
            wordAdder.add.next();
        }
        int numWords = wordAdder.add.nextInt();
        wordAdder.add.nextLine();

        NewsWord[] userWords = wordAdder.enterNewWords(numWords);

        for (NewsWord word : userWords) {
            System.out.println(word);
        }



        // CUENTA BANCARIA ************











    }
}