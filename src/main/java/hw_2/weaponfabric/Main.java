package hw_2.weaponfabric;

/**
 * Реализовать фабричный метод оружия (Меч, Лук, Пистолет)
 * Описание
 * В этой задаче нам нужно создать систему для создания различных видов оружия в игре
 * (например, мечи, луки и пистолеты). Все оружие будет иметь общий интерфейс,
 * но конкретные реализации оружия будут различаться. Мы будем использовать фабричный метод,
 * чтобы централизованно создавать объекты оружия.
 */
public class Main {
    public static void main(String[] args) {
        WeaponFabric weaponFabric;
        String weaponType = "bow";

        if ("gun".equals(weaponType)) {
            weaponFabric = new GunFabric();
        } else if ("sword".equals(weaponType)) {
            weaponFabric = new SwordFabric();
        } else {
            weaponFabric = new BowFabric();
        }

        weaponFabric.createWeapon().attack();
    }
}
