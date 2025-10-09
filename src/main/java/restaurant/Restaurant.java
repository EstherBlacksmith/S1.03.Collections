package restaurant;

import java.util.Objects;

public class Restaurant {

    private final String name;
    private final int score;

    public Restaurant(String name, int score) {
        Objects.requireNonNull(name, "Name must not be null");
        if(name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
        this.score = score;
    }

    protected String getName() {
        return name;
    }
    protected int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Restaurant " + name + " Score: " + score ;
    }


}
