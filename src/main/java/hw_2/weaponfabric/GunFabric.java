package hw_2.weaponfabric;

public class GunFabric extends WeaponFabric {
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }
}
