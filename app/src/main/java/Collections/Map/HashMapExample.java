package Collections.Map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public void someSalary() {
        Map<String, Integer> salary = new HashMap<>();
        salary.put("Ivanka", 300);
        salary.put("Volodymyr", 500);
        salary.put("Bogdan", 1200);
        salary.put("Andrii", 700);
        salary.put("Olena", 1000);
        salary.put("Anna", 400);


        int ivSal = salary.get("Ivanka");
        System.out.println("Ivanka has: " + ivSal + "per month");

        Set<String> people = salary.keySet();
        Collection<Integer> allSalarys = salary.values();
        salary.remove("Anna");
        for(Map.Entry item : salary.entrySet()){

            System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}
