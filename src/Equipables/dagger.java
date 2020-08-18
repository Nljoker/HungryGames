package Equipables;

import Controllers.chanceController;

public class dagger extends Weapons{

    public void dagger() {
        damageBonus = 1 + chanceController.getStatisticDamage(10);
        speed = 9;
        twoHanded = false;
        System.out.println("Has equiped a dagger!");
    }

}
