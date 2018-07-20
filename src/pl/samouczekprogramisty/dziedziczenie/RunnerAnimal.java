package pl.samouczekprogramisty.dziedziczenie;

public class RunnerAnimal {
    public static void main(String[] args) {

        Goldfish goldfish1 = new Goldfish();
        Fish goldfish2 = new Goldfish();
        System.out.println(goldfish1.toString());
        goldfish1.move();

        Human human = new Human();
        System.out.println(human.toString());

    }
}
