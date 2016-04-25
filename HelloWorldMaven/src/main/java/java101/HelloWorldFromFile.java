package java101;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class HelloWorldFromFile {

    public static void main(String... args) {
        File file = new File("helloworld.txt");
        try {
            String fileContents = FileUtils.readFileToString(file);
            System.out.println(fileContents);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
