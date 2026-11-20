package hw_2.fabrictransport;

/**
 * Реализовать фабричный метод транспортных средств (Автомобиль, Велосипед)
 * Описание
 * В этом приложении нам нужно создать систему для создания различных типов транспортных средств
 * (например, автомобили и велосипеды). Вместо того чтобы код зависел от конкретных классов
 * (например, Car и Bicycle), мы будем использовать фабричный метод для создания объектов.
 * Это позволит расширять систему, добавляя новые типы транспортных средств, не меняя существующий код.
 */
public class Main {
    public static void main(String[] args) {
        TransportFabric transportFabric;
        String transportType = "bicycle";

        if ("car".equals(transportType)) {
            transportFabric = new CarFactory();
        } else {
            transportFabric = new BicycleFactory();
        }

        transportFabric.createTransport().drive();
    }
}
