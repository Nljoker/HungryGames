package Equipables;

import Controllers.chanceController;

public class smallShield extends Weapons{
    public void smallShield() {
        defence = damageBonus - (1 + chanceController.getStatisticDamage(5));
        System.out.println("Has equiped a small shield!");

    }
}
