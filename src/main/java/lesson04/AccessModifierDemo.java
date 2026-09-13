package lesson04;

public class AccessModifierDemo {
    public static void main(String[] args) {
            // public: mọi nơi
            Dog dog3 = new Dog("jake", 2);


            // protected: cùng package hoặc class con
            Dog dog4 = new Dog("jake4", 67);

            // default: cùng package, mặc định
            Dog dog5 = new Dog("jake67", 99);
            // dog5.id = 1;
    }
}
