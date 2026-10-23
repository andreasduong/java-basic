package lesson06;

import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            String content = readFile();
            System.out.println(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public static String readFile() throws IOException  {
        throw new IOException("File ko tồn tại");
    }
}
