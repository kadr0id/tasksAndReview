package oop.solid.liskovsSubstitution;

public class MobilePhone {
    NigthCam nigthCam;
    Cam cam;

    public void makeSomePhoto(ICam cam) {
        if (cam.equals(nigthCam)) {
            nigthCam.turnON();
        }
        cam.doPhoto();
    }
}
