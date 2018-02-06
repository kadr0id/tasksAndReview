package inputOutput;


import java.io.Serializable;

public class ReadWriteWithSerialization implements Serializable{
    String someText;

    public ReadWriteWithSerialization(String someText){
        this.someText = someText;
    }

}
