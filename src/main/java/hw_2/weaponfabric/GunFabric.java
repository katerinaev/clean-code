package hw_2.weaponfabric;

public class GunFabric extends WeaponFabric {
    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}
