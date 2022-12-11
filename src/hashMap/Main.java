package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("England");
        Country country2 = new Country("Germany");
        Country country3 = new Country("Russia");
        Country country4 = new Country("Poland");
        Country country5 = new Country("USA");
        Country country6 = new Country("Brazil");
        Country country7 = new Country("Spain");
        Country country8 = new Country("France");
        Country country9 = new Country("Italy");
        Country country10 = new Country("Netherlands");
        City city1 = new City("London");
        City city2 = new City("Berlin");
        City city3 = new City("Moscow");
        City city4 = new City("Warsaw");
        City city5 = new City("Washington");
        City city6 = new City("Rio");
        City city7 = new City("Madrid");
        City city8 = new City("Paris");
        City city9 = new City("Rome");
        City city10 = new City("Amsterdam");

        HashMap<String, String> capitalCountry = new HashMap<>();
        capitalCountry.put(country1.country, city1.city);
        capitalCountry.put(country2.country, city2.city);
        capitalCountry.put(country3.country, city3.city);
        capitalCountry.put(country4.country, city4.city);
        capitalCountry.put(country5.country, city5.city);
        capitalCountry.put(country6.country, city6.city);
        capitalCountry.put(country7.country, city7.city);
        capitalCountry.put(country8.country, city8.city);
        capitalCountry.put(country9.country, city9.city);
        capitalCountry.put(country10.country, city10.city);
        System.out.println("All country and cities ----------------------------------------");
        System.out.println(capitalCountry);
        System.out.println("Get city for Key ----------------------------------------------");
        System.out.println(capitalCountry.get("Russia"));
        System.out.println("How many countries ----------------------------------------------");
        System.out.println(capitalCountry.size());
        System.out.println("Key Loop FOR ---------------------------------------------------");
        for (String i : capitalCountry.keySet()) {
            System.out.println("Countries: " + i);
        }
        System.out.println("Values Loop FOR -------------------------------------------------");
        for (String i : capitalCountry.values()) {
            System.out.println("Cities: " + i);
        }
        System.out.println("All items Loop FOR -------------------------------------------------");
        for (String i : capitalCountry.keySet()) {
            System.out.println("Country: " + i + " - City: " + capitalCountry.get(i));
        }
        System.out.println("Remove for Key -------------------------------------------------");
        capitalCountry.remove("France");
        System.out.println(capitalCountry);
    }
}

