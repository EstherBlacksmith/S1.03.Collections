package restaurant;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static Scanner inputScanner = new Scanner(System.in);

    private HashSet<Restaurant> ranking;
    /*Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
    Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom
    i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.
    Pot haver-hi restaurants amb el mateix nom amb diferent puntuació,
    però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.*/
    public static void main(String[] args) {

        System.out.println("Add a restaurant");
        addingRestaurant();
    }

    protected static void addingRestaurant(){
        String name = readString("Name a restaurant");
        int score = readInt("Score the restaurant");
        Restaurant restaurant = new Restaurant(name,score);

    }

    private static String readString(String question) {
        String readedString = "";
        System.out.println(question);

        while (readedString.equals("")) {
            if (inputScanner.hasNext()) {
                try {
                    readedString = inputScanner.next();

                } catch (RuntimeException e) {
                    System.out.println("Incorrect type.\n" + question);
                    inputScanner.next();
                }
            }
        }
        return readedString;
    }
    static int readInt(String question) {
        int readedInt = 0;
        System.out.println(question);

        while (readedInt == 0) {
            if (inputScanner.hasNext()) {
                try {
                    readedInt = inputScanner.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Incorrect type.\n" + question);
                    inputScanner.next();
                }
            }
        }
        return readedInt;
    }


}
