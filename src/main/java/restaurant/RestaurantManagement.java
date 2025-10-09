package restaurant;

import java.util.*;

public class RestaurantManagement {
    private static Set<Restaurant> ranking = new HashSet<>();

    static Scanner inputScanner = new Scanner(System.in);

    private static boolean findRestaurantAndScore(String name, int score) {
        boolean finded = false;

        for (var rest : ranking) {
            if (rest.getName().equalsIgnoreCase(name) && rest.getScore() == score) {
                finded = true;
                break;
            }
        }

        return finded;
    }

    protected static void addingRestaurant() {
        String name = readString("Name a restaurant");
        int score = readInt("Score the restaurant");
        if (findRestaurantAndScore(name, score)) {
            System.out.println("You cannot add the same restaurant with the same score to the ranking");
            return;
        }

        Restaurant restaurant = new Restaurant(name, score);
        ranking.add(restaurant);

    }

    private static String readString(String question) {
        String readedString = "";
        System.out.println(question);

        while (readedString == "") {
            if (inputScanner.hasNext()) {
                try {
                    readedString = inputScanner.nextLine();

                } catch (RuntimeException e) {
                    System.out.println("Incorrect type.\n" + question);
                    inputScanner.nextLine();
                }
            }
        }
        return readedString;
    }

    protected static int readInt(String question) {
        int readedInt;
        System.out.println(question);

        while (true) {
            try {
                readedInt = inputScanner.nextInt();
                if (readedInt < 0) {
                    throw new InputOnlyPositiveIntegerException("Must be a positive value.\n" + question);
                }
                return readedInt;
            } catch (InputMismatchException | InputOnlyPositiveIntegerException e) {
                System.out.println("Incorrect type.\n" + question);
                inputScanner.nextLine();
            }
        }
    }

    protected static void showRanking() {
        if(ranking.isEmpty()){
            System.out.println("There aren't restaurants yet!");
            return;
        }

        Comparator<Restaurant> comparingNameAndScore =  Comparator.comparing(Restaurant::getName)
                .thenComparingInt(Restaurant::getScore);

        List<Restaurant> sortedRestaurantSet = new ArrayList<>(ranking);
        sortedRestaurantSet.sort(comparingNameAndScore);
        for ( Restaurant restaurant : sortedRestaurantSet) {
            System.out.println(restaurant.toString());
        }


    }


}

