package hw_1.task_6.after1;

public class Main {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();
        Duck duck = new Duck();

        penguin.makeSound();
        sparrow.makeSound();
        duck.makeSound();

        Swimmable swimmable = new Penguin();
        Flyable flyable = new Sparrow();

        swimmable.swim();
        flyable.fly();

        duck.swim();
        duck.fly();
    }
}
