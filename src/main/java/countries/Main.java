package countries;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {
    static HashMap<String,String> countriesCapitals = new HashMap<>();
    static BufferedWriter bufferedWriter;
    public static void main(String[] args) {
        initializingCountriesData();
    }

    private static void initializingCountriesData() {
        String line = null;

        Path basePath = Paths.get(""); // Directorio actual
        Path filePath = basePath.resolve("src/main/resources/countries.txt");
        File file = new File(filePath.toString());

        try {
            bufferedWriter = new BufferedWriter( new FileWriter(filePath.toAbsolutePath().toFile().getName()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String[] parts = line.split("\\s");

            String country = parts[0].trim();
            String capital = parts[1].trim();

            if (!country.equals("") && !capital.equals(""))
                countriesCapitals.put(country, capital);
        }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readingFile(){
        Path basePath = Paths.get(""); // Directorio actual
        Path filePath = basePath.resolve("src/main/resources/countries.txt");
        try {
            bufferedWriter = new BufferedWriter( new FileWriter(filePath.toAbsolutePath().toFile().getName()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
