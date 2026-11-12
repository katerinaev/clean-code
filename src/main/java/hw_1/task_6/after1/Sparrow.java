package hw_1.task_6.after1;

public class Sparrow extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("Sparrow: Chirp-chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
