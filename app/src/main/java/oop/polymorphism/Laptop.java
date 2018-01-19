package oop.polymorphism;

public class Laptop {
    public void doSomething(){
    }

    public void workOnLaptop(){
        FastLaptop fastLaptop = new FastLaptop();
        SlowLaptop slowLaptop = new SlowLaptop();
        fastLaptop.doSomething();
        slowLaptop.doSomething();
    }
}
