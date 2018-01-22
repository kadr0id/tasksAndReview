package oop.cloning;

//shallow clone

public class SimpleAddressBook implements Cloneable{
    private String name;
    private String adress;

    public SimpleAddressBook(String name, String adress) throws CloneNotSupportedException {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public SimpleAddressBook clone() throws CloneNotSupportedException{
        return (SimpleAddressBook) super.clone();
    }


    SimpleAddressBook simpleAddressBook = new SimpleAddressBook("Andrii", "Valova 21/12");
    SimpleAddressBook simpleAddressBook2 = simpleAddressBook.clone();

}
