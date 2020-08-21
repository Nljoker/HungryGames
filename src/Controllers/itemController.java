package Controllers;

import Equipables.*;

import java.util.ArrayList;

public class itemController extends Weapons{
    public ArrayList<Weapons> weaponManager = new ArrayList<>(); // Create an ArrayList object
    public ArrayList<Weapons> startWeapon = new ArrayList<>(); // Create an ArrayList object


    //add the wanted items to the hungry games
    public itemController() {
        weaponManager.add(new battleAxe());
        weaponManager.add(new bowAndArrow());
        weaponManager.add(new dagger());
        weaponManager.add(new largeShield());
        weaponManager.add(new smallShield());
        weaponManager.add(new Sword());

        //Loop through the items and check if the right instance is selected
        for (Weapons weap : weaponManager) {
            //This used to be an instanceof check, however IntelliJ recommended this since the other one was redundant.
            if (weap != null) {
                //add the item to whatever item a participant can start with
                startWeapon.add(weap);
            }
        }
    }
    //call this method to give an item to a participant
    public Weapons returnFightItem() {
        return startWeapon.get(chanceController.luckIndex(weaponManager.size()));
    }


    //double check if a random class is selected
    //public void print() {
        //System.out.println(returnFightItem());
    //}


}

//    public Weapons getWeapon() {
//        if (!weaponManager.isEmpty()) {
//            int n = chanceController.luckIndex(3);
//            Weapons weapon = weaponManager.get(n);
//            return weaponManager.get(n);
//        }
//        int z = chanceController.luckIndex(weaponManager.size());
//        return weaponManager.get(z);
//    }
//}
