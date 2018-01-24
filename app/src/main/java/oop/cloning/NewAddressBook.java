package oop.cloning;

//copy with constructor

public class NewAddressBook {
    private String name;
    private String address;

    public NewAddressBook(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public NewAddressBook(NewAddressBook newAddressBook) {
        this(newAddressBook.getName(), newAddressBook.getAddress());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getAddress() {
        return address;
    }


    public static void createAddressBook() {
        NewAddressBook first = new NewAddressBook("Oleg", "Vygovskogo 6/1");
        NewAddressBook second = new NewAddressBook(first);
    }
}
