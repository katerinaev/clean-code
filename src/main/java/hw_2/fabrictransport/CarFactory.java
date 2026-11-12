package hw_2.fabrictransport;

public class CarFactory extends TransportFabric {
    @Override
    Transport createTransport() {
        return new Car();
    }
}
