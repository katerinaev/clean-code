package hw_2.weaponfabric;

public class SwordFabric extends WeaponFabric {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
