package Equipables;

import Controllers.chanceController;

public class largeShield extends Weapons{
    public void largeShield() {
        defence = damageBonus - (5 + chanceController.getStatisticDamage(5));
        System.out.println("Has equiped a large shield!");

    }
}
