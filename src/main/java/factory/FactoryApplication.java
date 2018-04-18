package factory;

public class FactoryApplication {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new WeaponFactory();

        Weapon pistol = weaponFactory.createWeapon(WeaponType.PISTOL);
        Weapon machinegun = weaponFactory.createWeapon(WeaponType.MACHINEGUN);
        Weapon grenadier = weaponFactory.createWeapon(WeaponType.GRENADIER);
        pistol.shoot();
        machinegun.shoot();
        grenadier.shoot();
    }



}
