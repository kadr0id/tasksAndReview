package Collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SearchingInSet {
    public void searching() {
        Set<String> name = new HashSet<>();
        name.add("Ivanka");
        name.add("Volodym");
        name.add("Bogdan");
        name.add("Andrii");
        name.add("Olena");
        name.add("Anna");

        for (Iterator<String> it = name.iterator(); it.hasNext(); ) {
            String s = it.next();
            if (s.equals("Bogdan"))
                System.out.println("Bogdan is found");
        }
    }

}
