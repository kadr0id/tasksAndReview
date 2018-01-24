package oop.cloning;


public class AddressOfPerson implements Cloneable {
    private String streetName;

    public AddressOfPerson(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetName(String name) {
        streetName = name;
    }

    public String getStreetName() {
        return streetName;
    }

    public AddressOfPerson clone() throws CloneNotSupportedException {
        return (AddressOfPerson) super.clone();
    }
}
