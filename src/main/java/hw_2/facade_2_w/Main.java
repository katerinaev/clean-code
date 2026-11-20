package hw_2.facade_2_w;
/**
 * Facade for a "Smart Home" System
 * Description
 * A "Smart Home" system includes several devices that control:
 * Lighting (on/off).
 * Air conditioning (on/off).
 * Security system (on/off).
 * The client requires a unified interface to manage (turn on/off) all these devices,
 * while hiding the implementation details of each one. We will use the Facade pattern
 * to consolidate all these operations into a single interface.
 */
public class Main {
    public static void main(String[] args) {
        SmartHomeFacade facade = new SmartHomeFacade();
        System.out.println("Turning on smart home...");
        facade.turnOnAll();

        System.out.println();

        System.out.println("Turning off smart home...");
        facade.turnOffAll();
    }
}
