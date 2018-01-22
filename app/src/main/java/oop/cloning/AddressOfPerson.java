package oop.cloning;


public class AddressOfPerson implements Cloneable {
    private String streetName;

    public void setStreetName(String n){ streetName=n;}
    public String getStreetName(){ return streetName;}
    public AddressOfPerson(String streetName){
        this.streetName = streetName;
    }

    public AddressOfPerson clone() throws CloneNotSupportedException{
        return (AddressOfPerson) super.clone();
    }
}
