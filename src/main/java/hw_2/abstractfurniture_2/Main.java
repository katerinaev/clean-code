package hw_2.abstractfurniture_2;

/**
 * Реализовать абстрактную фабрику мебели (Современная мебель, Классическая мебель)
 * Описание
 * В мебельном магазине предлагаются два стиля мебели: современный и классический.
 * Клиент должен выбрать только стиль, а конкретные элементы мебели (например, стулья и столы)
 * должны подбираться автоматически в зависимости от выбранного стиля.
 * Мы будем использовать абстрактную фабрику, чтобы разделить создание современных и классических
 * элементов мебели.
 */
public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory;
        String furnitureType = "modern";

        if ("classic".equals(furnitureType)) {
            furnitureFactory = new ClassicFurnitureFactory();
        } else {
            furnitureFactory = new ModernFurnitureFactory();
        }

        furnitureFactory.createChair().sitOn();
        furnitureFactory.createTable().use();
    }
}
