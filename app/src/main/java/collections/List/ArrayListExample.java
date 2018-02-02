package collections.List;


import java.util.ArrayList;

public class ArrayListExample {

   public void someFruits(){
       ArrayList<String> fruits = new ArrayList<>();
       fruits.add("pear");
       fruits.add(1, "plum");
       ArrayList<String> addFruit = new ArrayList<>(2);
       addFruit.size();
       addFruit.add("apple");
       addFruit.add("cherry");
       fruits.addAll(addFruit);
       fruits.addAll(2, addFruit);
       fruits.indexOf(2);
       addFruit.clear();
       addFruit.contains(fruits);
       fruits.get(0);
       fruits.set(0, "lemon");
       System.out.println(fruits.indexOf(2));
       for (String s : fruits){
           System.out.println(s);
       }

   }
}
