package oop.encapsulation;

/**
 * Created by ykandrin on 18-Jan-18.
 */
public class CoffeeMaker {

    CoffeeIngredients ingredients = new CoffeeIngredients();
    public void makeCoffee(){
        ingredients.setCoffeeBeans(10);
        ingredients.setWater(300);
        ingredients.setSugar(3);
        ingredients.setMilk(30);

        System.out.println("Cup of coffee");
    }

}
