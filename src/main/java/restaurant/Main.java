package restaurant;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    static Scanner inputScanner = new Scanner(System.in);

    private static HashSet ranking;
    /*Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
    Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom
    i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.
    Pot haver-hi restaurants amb el mateix nom amb diferent puntuació,
    però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.*/
    public static void main(String[] args) {
        ranking = new HashSet<Restaurant>();
        menu();
    }

    protected static boolean findRestaurantAndScore(String name, int score){
        boolean finded = false;
        for (Object restaurant : ranking) {
            System.out.println(restaurant);
        }
/*
        ranking.stream().forEach(Restaurant-> {
                    Restaurant.getName();
                })
                .filter(restaurant -> restaurant.getName()
                        each -> each.equals(new String("3")))
                .findFirst()
                .orElse(null);

        if(!ranking.isEmpty()){


            Iterator<Restaurant> it = ranking.iterator();

            while(it.hasNext()) {

                Restaurant restau = it.next();

                String name2 =restau.getName();
                int score2 = restau.getScore();
                if(name2.equals(name) && score2 == score){
                    finded =  true;
                }
                /*if((it.next().getName().equals(name))
                        && (it.next().getScore() == score)){
                    finded =  true;
                }else {
                    finded = false;
                }*/
           /* }
        }*/
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
        ranking.add(restaurant.getName().equals(name));

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
            Iterator<Restaurant> it = ranking.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
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
