package restaurant;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static Scanner inputScanner = new Scanner(System.in);

    private static HashSet <Restaurant> ranking;

    public static void main(String[] args) {
        ranking = new HashSet<>();
        menu();
    }

    protected static boolean findRestaurantAndScore(String name, int score){
        boolean finded = false;

        for (var rest : ranking) {
            if(rest.getName().equalsIgnoreCase(name) && rest.getScore() == score){
                finded = true;
            }
        }

        return finded;
    }

    protected static void addingRestaurant(){
        String name = readString("Name a restaurant");
        int score = readInt("Score the restaurant");
        if(findRestaurantAndScore(name,score)){
            System.out.println("You cannot add the same restaurant with the same score to the ranking");
            return;
        }

        Restaurant restaurant = new Restaurant(name,score);
        ranking.add(restaurant);

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

    private static void showRanking(){

        if(ranking.isEmpty()){
            System.out.println("There aren't restaurants yet");
        }else{
            for (var rest : ranking) {
                System.out.println(rest);
            }

        }
    }



    private static void menu(){
        int option = 0;

        while (option != 3) {

            option =readInt("1 Add a restaurant\n2 Show the ranking\n3 Exit");

            switch (option){
                case 1 -> {
                    addingRestaurant();
                }
                case 2 -> {
                    showRanking();
                }
                case 3 -> {
                    return;
                }
                default -> {
                    System.out.println("Incorrect option");
                }
            }
        }


    }

}
