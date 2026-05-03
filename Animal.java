package oop;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Animal Name: " + name);
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public final void eat() {
        System.out.println("Animal eats food");
    }

    public static void info() {
        System.out.println("This is Animal class");
    }
}