package oop.encapsulation;

/**
 * Created by ykandrin on 18-Jan-18.
 */

public class CoffeeIngredients{
    private int coffeeBeans;
    private int water;
    private int sugar;
    private int milk;

    public int getCoffeeBeans(){
        return coffeeBeans;
    }

    public int getWater(){
        return water;
    }

    public int getSugar(){
        return sugar;
    }

    public int getMilk(){
        return milk;
    }

    public void setCoffeeBeans(int coffeeBeans){
        this.coffeeBeans = coffeeBeans;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }
}
