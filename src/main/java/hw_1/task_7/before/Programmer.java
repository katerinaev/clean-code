package hw_1.task_7.before;

public class Programmer implements Worker {

    @Override
    public void work() {
        System.out.println("A programmer writes code");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("A programmer does not eat at work");
    }
}
