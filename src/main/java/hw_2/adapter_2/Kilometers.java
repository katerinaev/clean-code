package hw_2.adapter_2;

public class Kilometers implements  Distance {
    private final double kilometers;

    public Kilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double distance() {
        return kilometers;
    }
}
