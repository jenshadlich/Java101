package java101;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class HelloWorldFromFile {

    public static void main(String... args) {
        File file = new File("helloworld.txt");
        try {
            String fileContents = FileUtils.readFileToString(file, Charset.forName("UTF-8"));
            System.out.println(fileContents);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
