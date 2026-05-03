package oop;

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog("Rex");
        d.display();
        d.sound();

        Puppy p = new Puppy("Tiny");
        p.display();
        p.sound();

        Cat c = new Cat("Kitty");
        c.display();
        c.sound();

        d.eat();

        Animal.info();
        Dog.info();

        Tiger t = new Tiger();
        t.show();
    }
}