package oop.solid.openClosed;




public class DeviceManager {
    public void checkBluetooth(Bluetooth bluetooth){
        if(bluetooth.isBluetoothON()){
            System.out.println("Bluetooth is off");
        }
    }

    public void checkWiFi(WiFi wiFi){
        if(wiFi.isWiFiON()){
            System.out.println("Wi-Fi is off");
        }
    }

}
