package countries;

import java.io.*;
import java.util.*;

public class Country {
    static HashMap<String,String> countriesCapitals = new HashMap<>();


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
