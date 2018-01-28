package oop.solid.liskovsSubstitution;


public class NigthCam implements ICam, Flash {

    @Override
    public void doPhoto() {
        if (!turnON()) turnON();
    }

    @Override
    public boolean turnON() {
        return true;
    }
}
