package pl.samouczekprogramisty.dziedziczenie;

public abstract class Fish extends Animal {

    public String toString() {
        return "To obiekt klasy Fish";
    }

    @Override
    public void move() {
        System.out.println("I am swimming: Fish");
    }

}
