package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class InputOutput {
    public static void main(String[] args) {
        String prefix = System.getProperty("user.dir")+ File.separator+"src"+File.separator;
        try{
            FileReader input = new FileReader(prefix+"read.in");

            FileWriter output = new FileWriter(prefix+"write.out", true);

            int character;

            while((character = input.read()) != -1){
                output.write(character);
            }

            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}