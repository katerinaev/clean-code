package hw_2.adapter_2;

public class MilesToKilometersAdapter implements Distance {
    private final Miles miles;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }

    @Override
    public double distance() {
        return miles.distance() * 1.60934;
    }
}
