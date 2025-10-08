package restaurant;

import java.util.Scanner;

public class Restaurant {

    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Restaurant " + name + " Score: " + score ;
    }


}
