package lesson02;

public class Dog {
    int max(int a , int b) {
       return a > b ? a : b;        
    }


    boolean isPrime(int a){
        for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
        } return true;
    }

    void bark() {
        System.out.println("Gâu gâu gâu.....");
    }
}
