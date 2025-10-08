package restaurant;

public class Restaurant {

    private final String name;
    private final int score;

    public Restaurant(String name, int score) {
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
