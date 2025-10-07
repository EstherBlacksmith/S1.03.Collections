package countries;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Country {
    static HashMap<String,String> countriesCapitals = new HashMap<>();
    static BufferedWriter bufferedWriter;

    public Country() {
    }

    private static File gettingPath(){
        Path basePath = Paths.get("");
        Path filePath = basePath.resolve("src/main/resources/countries.txt");
        return new File(filePath.toString());
    }

    protected static void initializingCountriesData() {
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

    protected static String getCountryName() {
        Random randomInt = new Random();
        int index = randomInt.nextInt(countriesCapitals.size());

        List<Map.Entry<String, String>> entryList =  new ArrayList<>(countriesCapitals.entrySet());

        Map.Entry<String, String> entryAtIndex = entryList.get(index);  // Getting the entry at index 1

        return  entryAtIndex.getKey();
    }

    protected static String getCapitalName(String country){
        return countriesCapitals.getOrDefault(country, "");
    }
}
