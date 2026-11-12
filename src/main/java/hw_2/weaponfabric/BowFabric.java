package hw_2.weaponfabric;

public class BowFabric extends WeaponFabric {
    @Override
    Weapon createWeapon() {
        return new Bow();
    }
}
