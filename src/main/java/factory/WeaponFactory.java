package factory;

public class WeaponFactory {

    public Weapon createWeapon (WeaponType type) {
        switch (type) {
            case PISTOL:
                return new Glock();
            case MACHINEGUN:
                return new AK47();
            case GRENADIER:
                return new MK19();
            default:
                return null;
        }
    }
}
