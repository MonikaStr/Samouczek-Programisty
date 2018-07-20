package pl.samouczekprogramisty.dziedziczenie;

public class Goldfish extends Fish {

    public String toString() {
        return "To obiekt klasy Goldfish";
    }

    @Override
    public void move() {
        System.out.println("I am swimming in a charming way: Goldfish");
    }
}
