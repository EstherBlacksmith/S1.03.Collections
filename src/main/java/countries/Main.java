package countries;

public class Main {
    public static void main(String[] args) {
        Country.countriesCapitals = FileManagement.initializingCountriesData();

        GameManagement.askUserForName();

        GameManagement.askingTheCapitals();

        System.out.println("Your Score is " + GameManagement.score);

        FileManagement.storeScore(GameManagement.userName,GameManagement.score);
    }
}
