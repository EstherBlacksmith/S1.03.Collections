package personalDataFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static void readingFIle() {
        Path basePath = Paths.get("");
        Path filePath = basePath.resolve("src/main/resources/countries.txt");
        File personFile = new File(filePath.toString());

        try (Scanner myReader = new Scanner(personFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
