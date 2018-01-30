package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SearchingInMap {

    public void seartingByNumber() {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("093-000-00-00", "Masha");
        contacts.put("063-000-00-00", "Kolia");
        contacts.put("098-000-00-00", "Vova");
        contacts.put("099-000-00-00", "Oleg");
        contacts.put("067-000-00-00", "Vasyl");
        contacts.put("068-000-00-00", "Ira");
        contacts.put("050-000-00-00", "Zina)");


        Set<String> people = contacts.keySet();
        Collection<String> allSalarys = contacts.values();

        contacts.remove("Ira");
        for (Map.Entry item : contacts.entrySet()) {

            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
