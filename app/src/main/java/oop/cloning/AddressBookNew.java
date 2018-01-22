package oop.cloning;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//clone with serialization

public class AddressBookNew implements Serializable {
    private String name;
    private String address;

    public AddressBookNew(String name, String address) {
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


    public static void createNewAddressBook() throws IOException, ClassNotFoundException {
        AddressBookNew addressBookNew = new AddressBookNew("Sasha", "Kopernyka 7/1");
        ByteArrayOutputStream array = new ByteArrayOutputStream();
        ObjectOutputStream stream = new ObjectOutputStream(array);
        stream.writeObject(addressBookNew);
        stream.close();
        ByteArrayInputStream impArray = new ByteArrayInputStream(array.toByteArray());
        ObjectInputStream impStream = new ObjectInputStream(impArray);
        AddressBookNew addressBookNew1 = (AddressBookNew)impStream.readObject();
        addressBookNew1.setName("Olena");
        addressBookNew1.setAddress("Doroshenka 14/11");
    }
}
