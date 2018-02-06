package inputOutput;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCVSinList  {

    public String someText;
    ArrayList<String> list = new ArrayList<>();
    public void readFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\MyPersonalDocuments\\ObjectsString.txt"));
        while ((someText = reader.readLine())!=null){
            list.add(someText);
        }
        for (String s : list){
            System.out.println(s);
        }
    }
}
