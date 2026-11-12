package hw_2.fabrictransport;

public class BicycleFactory extends TransportFabric {
    @Override
    Transport createTransport() {
        return new Bicycle();
    }
}
