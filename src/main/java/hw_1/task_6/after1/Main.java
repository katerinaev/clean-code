package hw_1.task_6.after1;

public class Main {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();

        penguin.makeSound();
        ((Penguin) penguin).swim();

        sparrow.makeSound();
        ((Sparrow) sparrow).fly();
    }
}
