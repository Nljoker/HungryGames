package Equipables;

import Controllers.chanceController;

public class bowAndArrow extends Weapons{

    public void quiver() {
        int arrowsInQuiver = 10;
        damageBonus = 3 + chanceController.getStatisticDamage(10);
        speed = 10;
        twoHanded = true;
        System.out.println("Has equiped a bow and arrow");
    }




}
