package lesson03;

public class Dog {
    String name;
    int age;

    //equals


    @Override
    public boolean equals(Object obj) {
        if (this == obj ) return true;
        if (!(obj instanceof Dog)) return  false;
        Dog that = (Dog) obj;
        return this.name.equals(that.name) && this.age == that.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // hash code

    }

