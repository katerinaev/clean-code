package hw_2.facade_2_w;

public class SmartHomeFacade {
    private Light light;
    private AirConditioner airConditioner;
    private SecuritySystem securitySystem;

    public SmartHomeFacade() {
        this.light = new Light();
        this.airConditioner = new AirConditioner();
        this.securitySystem = new SecuritySystem();
    }

    public void turnOnAll() {
        light.turnOn();
        airConditioner.turnOn();
        securitySystem.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        airConditioner.turnOff();
        securitySystem.turnOff();
    }
}
