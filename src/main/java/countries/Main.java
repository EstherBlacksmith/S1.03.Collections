package countries;

import java.util.Scanner;

public class Main {
/* El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria, guardat en el HashMap.
 Es tracta que l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. Si l’encerta se li suma un punt.
 Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria,
 llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.*/
static Scanner inputScanner = new Scanner(System.in);
static int score = 0;

    public static void main(String[] args) {
        Country.initializingCountriesData();

        for (int i = 0; i < 10 ; i++) {
            String answer = askingTheQuestion();
            if (validatingTheAnswer(answer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer!");
            }
        }
    }

    private static boolean validatingTheAnswer(String answer) {
        if(Country.getCapitalName(answer).isBlank()){
            return false;
        }else{
            return true;
        }
    }

    private static String askingTheQuestion() {
        return readString("Capital of : " + Country.getCountryName() + "?");
    }

    private static void askUserForName(){
        String userName = readString("Introduce your name");


        System.out.println("Capital of : " + Country.getCountryName() + "?");
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
