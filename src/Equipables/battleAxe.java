package Equipables;

import Controllers.chanceController;

public class battleAxe extends Weapons{

    public void battleAxe() {
        damageBonus = 8 + chanceController.getStatisticDamage(10);
        speed = 3;
        twoHanded = false;
        System.out.println("Has equiped a battle axe!");
    }


}
