package hw8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class myHomework {

    public String readFile(String filename) {
        String content = null;
        File file = new File(filename);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new myExcep("!!!FILE IS MISSING!!!", e);
        } /*finally {
            if(reader != null){
                reader.close();
            }
        }*/
        return content;
    }

    public static void main(String[] args) {
        myHomework hw = new myHomework();
        hw.readFile("asd.txt");
    }
}
