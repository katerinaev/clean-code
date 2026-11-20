package hw_2.adapter_2;

public class Miles implements Distance {
    private final double miles;

    public Miles(double miles) {
        this.miles = miles;
    }

    @Override
    public double distance() {
        return miles;
    }
}
