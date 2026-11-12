package hw_2.weaponfabric;

public class SwordFabric extends WeaponFabric {
    @Override
    Weapon createWeapon() {
        return new Sword();
    }
}
