package inputOutput;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadAndWrite {

    public void readAmnWriteSre() throws IOException {
        ReadWriteWithSerialization someObject = new ReadWriteWithSerialization("This object is serialized");
        String file = "readWriteSer.ser";

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(someObject);

        objectOutputStream.close();
        fileOutputStream.close();

        ReadWriteWithSerialization someNewObject = null;

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        try {
            someNewObject = (ReadWriteWithSerialization)objectInputStream.readObject();
        } catch (ClassNotFoundException e) {

            objectInputStream.close();
            fileInputStream.close();
            System.out.println(someNewObject.toString());
        }
    }
}
