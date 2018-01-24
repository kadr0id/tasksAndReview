package oop.inheritance;


public class SmartTV extends TV {

    private String model;
    private String brand;

    public SmartTV(String brand) {
        super(brand);
    }

    public void showsYouTubeVideo() {

    }

    public void function() {
        on();
        off();
        showsTVChannels();
        showsYouTubeVideo();
    }

}
