package Collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CopyingArrays {

    public void firstExample(){
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> newFruits = new ArrayList<>();
        fruits.add("pear");
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("lemon");
        Collections.copy(fruits, newFruits);
    }

    public void secondExample(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("pear");
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("lemon");
        ArrayList<String> newFruits = new ArrayList<>();
        newFruits = (ArrayList<String>)fruits.clone();
    }

    public void withConstructor() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("pear");
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("lemon");
        ArrayList<String> newFruits = new ArrayList<>(fruits);
    }

    public void withGetAll() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("pear");
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("lemon");
        ArrayList<String> newFruits = new ArrayList<>();
        newFruits.addAll(fruits);
    }
}
