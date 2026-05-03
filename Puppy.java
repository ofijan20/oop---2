package oop;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " makes small bark");
    }
}