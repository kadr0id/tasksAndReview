package oop.inheritance;

//same TV brand, but different model
public class TV {
    private String model;
    private String brand;


    public String getBrand() {
        return brand;
    }

    public TV(String brand) {

        this.brand = brand;
    }


    public void on() {
    }

    public void off() {
    }

    public void showsTVChannels() {
    }

    public void function() {
        on();
        off();
        showsTVChannels();
    }
}

