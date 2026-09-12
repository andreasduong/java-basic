package lesson03;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java core";
        String search  = "       SamSung    ";

        System.out.println("s.length() = " + s.length());
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.indexOf(\"a\") = " + s.indexOf('a'));
        System.out.println("search.trim() = " + search.trim());
        System.out.println("s.concat(search) = " + s.concat(search));
        System.out.println("s.replace('a', 'o') = " + s.replace('a', 'o'));
        System.out.println("s.substring(0, 3) = " + s.substring(0, 4));
        String[] words = s.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
