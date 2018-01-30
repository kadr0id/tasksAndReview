package Collections.Set;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public void someFruits() {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("pear");
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("lemon");


        System.out.println("Size of fruits: " + fruits.size());


        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());

        }
    }
}