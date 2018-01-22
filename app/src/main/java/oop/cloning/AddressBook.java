package oop.cloning;

//deep copy
public class AddressBook implements Cloneable{
    private String name;
    private AddressOfPerson addressOfPerson;

    public void setName(String n){ name=n;}
    public String getName(){ return name;}

   public void setAddressOfPerson (String a){ addressOfPerson.setStreetName(a);}
    public String getAddressOfPerson (){ return addressOfPerson.getStreetName();}

    AddressBook(String name, String addressOfPerson){

        this.name = name;
        this.addressOfPerson = new AddressOfPerson(addressOfPerson);
    }

    public AddressBook clone() throws CloneNotSupportedException{

        AddressBook newAddressBook = (AddressBook) super.clone();
        newAddressBook.addressOfPerson=(AddressOfPerson) addressOfPerson.clone();
        return newAddressBook;
    }

}
