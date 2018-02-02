package collections.Set;


import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

    public void someFruits() {
        SortedSet<String> fruits = new TreeSet<>();

        fruits.add("pear");
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("lemon");

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(11);
        numbers.add(4);
        numbers.add(171);
        numbers.add(3);
        numbers.add(0);
        numbers.add(345);
        System.out.println(numbers);
        System.out.println(fruits);



    }
}
