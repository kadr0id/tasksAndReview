package oop.solid.openClosed;


public class MobilePhone {

  private DeviceManager manager;

    public MobilePhone(DeviceManager manager) {
        this.manager = manager;
    }

    public void pushSomeData() {
        manager.pushData();
    }

    public void saveSomeData() {
        manager.saveData();
    }


}
