package jet.xml;

import java.io.*;

public class ReaderFile {
    private File file;

    public ReaderFile(String fullPath){
        this.file = new File(fullPath);
    }

    public String withReaderFileOnString() throws IOException{
        return withReaderFileOnString(this.file);
    }

    private String withReaderFileOnString(File file) throws IOException{
        String result = "";
        FileInputStream inputStream = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String str;
        while ((str = reader.readLine()) != null){
            result += str;
        }

        return result;
    }

    public void readerFileOn(String fullPath){
        this.file = new File(fullPath);
    }
}
