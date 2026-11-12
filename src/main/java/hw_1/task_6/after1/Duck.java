package hw_1.task_6.after1;

public class Duck extends Bird implements Flyable,Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Duck: Quack");
    }
}
