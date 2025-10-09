package restaurant;

import java.util.*;


public class Main {


    public static void main(String[] args) {

        menu();
    }


    private static void menu() {
        int option = 0;

        while (option != 3) {

            option = RestaurantManagement.readInt("1 Add a restaurant\n2 Show the ranking\n3 Exit");

            switch (option) {
                case 1 -> RestaurantManagement.addingRestaurant();

                case 2 -> RestaurantManagement.showRanking();

                case 3 ->{return;}

                default ->  System.out.println("Incorrect option");

            }
        }
    }

}
