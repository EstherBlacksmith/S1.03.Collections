package restaurant;

public class Restaurant {

    private String name;
    private int score;

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
