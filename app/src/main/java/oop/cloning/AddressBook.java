package oop.cloning;


public class AddressBook implements Cloneable{
    private String name;
    private AddressOfPerson addressOfPerson;

    public void setName(String n){ name=n;}
    public String getName(){ return name;}

//    public void setAddressOfPerson (String a){ addressOfPerson.setName(a);}
//    public String getAddressOfPerson (){ return addressOfPerson.getName();}

    AddressBook(String name, String addressOfPerson){

        this.name = name;
        this.addressOfPerson = new AddressOfPerson(addressOfPerson);
    }

}
