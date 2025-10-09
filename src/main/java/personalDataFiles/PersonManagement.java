package personalDataFiles;

import restaurant.InputOnlyPositiveIntegerException;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import java.util.*;
public class PersonManagement {

    static Scanner inputScanner = new Scanner(System.in);
    static List<Person> peopleArray = new ArrayList<>();
    static final String HEADER = "NAME      SECOND NAME     NIF";

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
    protected static boolean testingIfArrayHasValues(){
        if(peopleArray.isEmpty()){
            System.out.println("There isn't people yet!");
            return false;
        }else {
            return true;
        }
    }

    protected static void readingFile() {
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

                    Person person = createPerson(arrayLine);
                    if(person != null){
                        peopleArray.add(person);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
        }
    }

    protected static Person createPerson(String[] arrayLine) {
        Person person = null;

        if(arrayLine.length > 0){
            String name =  arrayLine[0];
            String secondName =  arrayLine[1];
            String DNI = arrayLine[2];

            if(name.isEmpty() || secondName.isEmpty() || DNI.isEmpty()){
                throw new RuntimeException("Some fields are empty");
            }

            person = new Person(name,secondName,DNI);
        }

        return person;
    }

    protected static void showPersonByIdentifier91() {
        if(!testingIfArrayHasValues()){
            return;
        }
        peopleArray.sort(Comparator.comparing(Person::getDNI).reversed());
        System.out.println(HEADER);
        peopleArray.forEach(System.out::println );
    }

    protected static void showPersonByIdentifier19() {
        if(!testingIfArrayHasValues()){
            return;
        }
        peopleArray.sort(Comparator.comparing(Person::getDNI));
        System.out.println(HEADER);
        peopleArray.forEach(System.out::println );
    }

    protected static void showPersonBySeconNameZA() {
        if(!testingIfArrayHasValues()){
            return;
        }
        peopleArray.sort(Comparator.comparing(Person::getSecondName).reversed());
        System.out.println(HEADER);
        peopleArray.forEach(System.out::println );
    }

    protected static void showPersonBySeconNameAZ() {
        if(!testingIfArrayHasValues()){
            return;
        }
        peopleArray.sort(Comparator.comparing(Person::getSecondName));
        System.out.println(HEADER);
        peopleArray.forEach(System.out::println );
    }

    protected static void showPersonByNameZA() {
        if(!testingIfArrayHasValues()){
            return;
        }
        peopleArray.sort(Comparator.comparing(Person::getName).reversed());
        System.out.println(HEADER);
        peopleArray.forEach(System.out::println );
    }

    protected static void showPersonByNameAZ() {
        if(!testingIfArrayHasValues()){
            return;
        }
        peopleArray.sort(Comparator.comparing(Person::getName));
        System.out.println(HEADER);
        peopleArray.forEach(System.out::println );
    }


}
