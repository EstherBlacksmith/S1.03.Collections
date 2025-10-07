package countries;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Country {
    static HashMap<String,String> countriesCapitals = new HashMap<>();


    public Country() {
    }

    private static File gettingPath(){
        Path basePath = Paths.get("");
        Path filePath = basePath.resolve("src/main/resources/countries.txt");
        return new File(filePath.toString());
    }

    protected static String getRandomCountryName() {
        Random randomInt = new Random();
        int index = randomInt.nextInt(countriesCapitals.size());

        List<Map.Entry<String, String>> entryList =  new ArrayList<>(countriesCapitals.entrySet());

        Map.Entry<String, String> entryAtIndex = entryList.get(index);  // Getting the entry at index 1

        return  entryAtIndex.getKey();
    }

    protected static String getCityName(String countryName){
        return countriesCapitals.get(countryName);
    }
}
