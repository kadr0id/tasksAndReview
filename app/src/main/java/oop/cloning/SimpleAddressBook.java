package oop.cloning;

//shallow clone

public class SimpleAddressBook implements Cloneable{
    private String name;
    private String address;

    public SimpleAddressBook(String name, String address) throws CloneNotSupportedException {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public SimpleAddressBook clone() throws CloneNotSupportedException{
        return (SimpleAddressBook) super.clone();
    }


    SimpleAddressBook simpleAddressBook = new SimpleAddressBook("Andrii", "Valova 21/12");
    SimpleAddressBook simpleAddressBook2 = simpleAddressBook.clone();

}
