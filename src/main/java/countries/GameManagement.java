package countries;

import java.util.Scanner;

public class GameManagement {

    static int score = 0;
    static String userName;
    static Scanner inputScanner = new Scanner(System.in);

    protected static void askingTheCapitals() {
        for (int i = 0; i < 10 ; i++) {
            String countryName = Country.getRandomCountryName();
            String answer = askingTheQuestion(countryName);
            if (validatingTheAnswer(answer, countryName)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer!");
            }
        }
    }

    private static boolean validatingTheAnswer(String answer, String countryName) {
        String capitalName = Country.getCityName(countryName);
        boolean correctAnswer = false;

        if(capitalName == null || capitalName.isBlank()){
            correctAnswer = false;
        } else if( capitalName.equalsIgnoreCase(answer)) {
            correctAnswer = true;
        }
        return correctAnswer;
    }

    private static String askingTheQuestion(String countryName) {
        return readString("Capital of : " + countryName + "?");
    }

    protected static void askUserForName(){
        userName = readString("Introduce your name");
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

}
