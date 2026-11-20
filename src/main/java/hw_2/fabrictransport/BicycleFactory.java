package hw_2.fabrictransport;

public class BicycleFactory extends TransportFabric {
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
