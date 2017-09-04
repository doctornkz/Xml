package jet.xml;

import java.io.*;

public class Xml {
    public static void main(String[] args){

        ReaderFile readerFile = new ReaderFile("E:\\Project\\Xml\\src\\main\\java\\jet\\xml\\test.xml");
        try {
            System.out.println(readerFile.withReaderFileOnString());
        }catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
