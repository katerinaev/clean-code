package hw_1.task_6.after1;

public class Penguin extends Bird implements Swimmable {
    @Override
    public void makeSound() {
        System.out.println("Quawk-quawk!");
    }

    @Override
    public void swim() {
        System.out.println("Penguin's swimming");
    }
}
