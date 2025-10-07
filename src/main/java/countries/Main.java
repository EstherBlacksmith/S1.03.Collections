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

    private static File gettingPath(){
        Path basePath = Paths.get("");
        Path filePath = basePath.resolve("src/main/resources/countries.txt");
        return new File(filePath.toString());
    }

    private static void initializingCountriesData() {
        String line = null;

        try {
            bufferedWriter = new BufferedWriter( new FileWriter(gettingPath().getName()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(gettingPath()));

        while (true) {
            try {
                if ((line = bufferedReader.readLine()) == null || line.isBlank()){
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String[] parts = line.split("\\s");

            String country = parts[0].trim();
            String capital = parts[1].trim();
            if (!country.isEmpty() && !capital.isEmpty())
                countriesCapitals.put(country, capital);
        }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
