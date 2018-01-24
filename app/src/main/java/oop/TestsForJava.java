package oop;

import oop.cloning.SimpleAddressBook;
import oop.comparing.Cup;
import oop.polymorphism.FastLaptop;
import oop.polymorphism.Laptop;
import oop.polymorphism.SlowLaptop;


public class TestsForJava {

    SimpleAddressBook simpleAddressBook = new SimpleAddressBook("Andrii", "Valova 21/12");
    SimpleAddressBook simpleAddressBook2 = simpleAddressBook.clone();

    public TestsForJava() throws CloneNotSupportedException {
    }

    public static void main (String args[]){
        Cup.result();
        System.out.println();
    }

    public void someLaptop(Laptop laptop){
        laptop.doSomething();
    }

    public void workOnLaptop(){
        Laptop laptop = new FastLaptop();
        Laptop slowLaptop = new SlowLaptop();
        laptop.doSomething();
        slowLaptop.doSomething();
        someLaptop(laptop);
    }

}
