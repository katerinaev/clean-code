package hw_2.weaponfabric;

public class BowFabric extends WeaponFabric {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
