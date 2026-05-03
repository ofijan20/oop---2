package oop;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " barks");
    }

    public static void info() {
        System.out.println("This is Dog class");
    }
}