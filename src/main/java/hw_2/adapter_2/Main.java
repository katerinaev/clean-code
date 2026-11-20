package hw_2.adapter_2;
/**
 Adapter for Converting Miles to Kilometers
 Description
 The project includes a system that operates using miles (for example, a legacy system),
 while the new system requires the use of kilometers. An adapter must be created to convert
 miles into kilometers, allowing the new system to function with these values
 without requiring any changes to its internal logic.
 1. Distance Interface: This interface is used to handle distances across different units
 of measurement (miles and kilometers).
 2. Miles and Kilometers Classes: These classes implement the Distance interface,
 representing distances in miles and kilometers, respectively.
 3. MilesToKilometersAdapter Class: This adapter converts miles into kilometers,
 enabling the system to work with kilometers even though it is fundamentally based on miles.
 */
public class Main {
    public static void main(String[] args) {
        Miles miles = new Miles(100);
        MilesToKilometersAdapter adapter = new MilesToKilometersAdapter(miles);
        Kilometers km = new Kilometers(50);

        System.out.println("Distance in miles: " + miles.distance());
        System.out.println("Distance in kilometers: " + adapter.distance());
        System.out.println("Distance in kilometers: " + km.distance());
    }
}
