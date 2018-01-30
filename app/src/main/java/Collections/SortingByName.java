package Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByName {
    public void shorting() {
        List<String> name = new ArrayList<>();
        name.add("Ivanka");
        name.add("Volodym");
        name.add("Bogdan");
        name.add("Andrii");
        name.add("Olena");
        name.add("Anna");
        Collections.sort(name, new Comparator<String>() {
            public int compare(String firstName, String secondName) {
                return firstName.toString().compareTo(secondName.toString());
            }
        });
        for (String names : name) {
            System.out.println(names);
        }
    }
}
