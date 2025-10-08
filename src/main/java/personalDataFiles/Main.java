package personalDataFiles;

import restaurant.InputOnlyPositiveIntegerException;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        readingFIle();
    }

    static int readInt(String question) {
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
    public static void readingFIle() {
        final String  DELIMITER = ",";


        Path basePath = Paths.get("");
        Path filePath = basePath.resolve("src/main/resources/person.csv");
        File personFile = new File(filePath.toString());

        try (Scanner myReader = new Scanner(personFile)) {
            myReader.useDelimiter(DELIMITER);

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                if(!line.isBlank()) {
                    String[] arrayLine = line.split(DELIMITER);
                    createPerson(arrayLine);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    private static void createPerson(String[] arrayLine) {

        if(arrayLine.length > 0){
            String name =  arrayLine[0];
            String secondName =  arrayLine[1];
            String DNI = arrayLine[2];

            if(name.isEmpty() || secondName.isEmpty() || DNI.isEmpty()){
                throw new RuntimeException("Some fields are empty");
            }

            Person person = new Person(name,secondName,DNI);
        }
    }


    private static void menu() {
        while (true) {
            int option = 0;
            option = readInt("1 Read the file\n2 Show people by name (A-Z) \n3 Show people by name (Z-A) "
                    + "\4Show people by second name (A-Z)\n5 Show people second name (Z-A)\n6 Show people by DNI (1-9)"
                    + "\n7 Show people by DNI (9-1)\n0 Exit");

            switch (option) {
                case 1 -> {
                    readingFIle();
                }
                case 2 -> {
                    showPersonByNameAZ();
                }
                case 3 -> {
                    showPersonByNameZA();
                }
                case 4 -> {
                    showPersonBySeconNameAZ();
                }
                case 5 -> {
                    showPersonBySeconNameZA();
                }
                case 6 -> {
                    showPersonByIdentifier19();
                }
                case 7 ->{
                    showPersonByIdentifier91();
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("Incorrect option");
                }
            }
        }
    }

    private static void showPersonByIdentifier91() {
    }

    private static void showPersonByIdentifier19() {
    }

    private static void showPersonBySeconNameZA() {
        
    }

    private static void showPersonBySeconNameAZ() {
        
    }

    private static void showPersonByNameZA() {
        
    }

    private static void showPersonByNameAZ() {
        Comparator<Person> personNameComparator =
                Comparator.comparing(x -> x.getName());
        List<Person> personArray = List.of();
        personArray.sort(Comparator.comparing(Person::personNameComparator));



    }
}
