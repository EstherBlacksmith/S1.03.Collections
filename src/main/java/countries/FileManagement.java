package countries;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

import static java.awt.SystemColor.text;

public class FileManagement {
    private static Path basePath = Paths.get("");

    private static File gettingPath() {
        Path basePath = Paths.get("");
        Path filePath = basePath.resolve("src/main/resources/countries.txt");
        return new File(filePath.toString());
    }

    protected static HashMap<String, String> initializingCountriesData() {
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(gettingPath()));

            while (true) {
                try {
                    if ((line = bufferedReader.readLine()) == null || line.isBlank()) {
                        break;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                String[] parts = line.split("\\s");

                String country = parts[0].trim();
                String capital = parts[1].trim();
                if (!country.isEmpty() && !capital.isEmpty())
                    Country.countriesCapitals.put(country, capital);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return Country.countriesCapitals;

    }

    protected static void storeScore(String name, int score) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Path filePath = basePath.resolve("src/main/resources/score_" + name + ".txt");

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath.toFile(),true));
            Calendar calendar = Calendar.getInstance();
            calendar.getTime();
            bufferedWriter.write(calendar.getTime() + " Score: " + score + "\n");

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}

