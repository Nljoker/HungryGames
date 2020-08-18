package Equipables;

import Controllers.chanceController;

public class Sword extends Weapons {

    public void sword() {
        damageBonus = 5 + chanceController.getStatisticDamage(10);
        speed = 8;
        twoHanded = false;
        System.out.println("Has equiped a sword!");
    }


}
