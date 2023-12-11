import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();

        countries.add("USA");
        countries.add("Canada");
        countries.add("France");
        countries.add("Japan");
        countries.add("Australia");


        System.out.println("Countries:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}