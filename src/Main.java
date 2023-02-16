import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void chapter() {
        System.out.println();
        System.out.println("-".repeat(30));
    };
    public static void main(String[] args) {

        Dog dog = new Dog("Archy");
        dog.doSound();
        dog.doAggressiveSound();
        Cock cock = new Cock("Gilardo", "co co co");
        cock.doSound();
        cock.doAggressiveSound();

        chapter();
        // Collection
        Animal[] animals = {
                new Dog("Archy"),
                new Dog("Boxer"),
                new Dog("Lucky"),
                new Cock("Gilardo"),
                new Cock("Rocky"),
                new Cock("Curcan"),
        };
        for (Animal animal:animals) {
            animal.doSound();
            animal.doAggressiveSound();
        }
        chapter();
    }
}