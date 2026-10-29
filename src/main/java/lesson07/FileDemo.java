package lesson07;

import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources";

        System.out.println(FileManager.exists(path));
        System.out.println(FileManager.isFile(path));
        System.out.println(FileManager.isDirectory( path));
        FileManager.createNewFile(path + "/abc.txt");
        FileManager.mkdirs(path + "/database");

        String[] names = FileManager.list(path);
        for (String name : names) {
            System.out.println("👉🏻 " + name);
        }

        FileManager.moveTo(path + "/abc.txt", path + "/database/lesson.sql" );
        FileManager.delete(path + "/database/lesson.sql");
        FileManager.delete(path + "/database");
        FileManager.delete(path + "/abc.txt");
    }

}
