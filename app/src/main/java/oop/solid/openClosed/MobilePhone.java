package oop.solid.openClosed;


public class MobilePhone implements Bluetooth, WiFi{
    public boolean isBluetoothON(){
        System.out.println("Bluetooth ON");
        return true;
    }
    public boolean isWiFiON(){
        System.out.println("Wi-Fi ON");
        return true;
    }
}
