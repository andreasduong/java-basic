package lesson07;

import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) {
        String path = "src/main/resources/abc.txt";

        byte[] bytes = "Java core".getBytes(StandardCharsets.UTF_8);
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, true);
        IOManager.writeFile(path, bytes, false);


        Account acc1 = new Account(1, "Long", "1234");
        IOManager.writeObject(path,acc1,false);
        Account savedAccount = (Account) IOManager.readObject(path);
        System.out.println(savedAccount);
    }

}
