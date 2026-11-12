package hw_1.task_6.before;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins don't fly");
    }
}
