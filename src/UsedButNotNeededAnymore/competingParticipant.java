package UsedButNotNeededAnymore;

import Equipables.*;
import Other.*;
import Controllers.*;
import Food.*;

public class competingParticipant extends ParticipantAttributes implements Participant {

randomNameGenerator randomNameGenerator = new randomNameGenerator();
ArenaController arenaController = new ArenaController();
itemController itemController = new itemController();
Food food = new MantaRay();
Weapons weapon = null;

    @Override
    public void fight() {
        equip(itemController.returnFightItem());
        if (currentHP <= 0) {
            isAlive = false;
            System.out.println(name() + " has died");
        }
    }

    @Override
    public void heal() {
        if (currentHP == 99) {
            food.healLifePoints();
            System.out.println(currentHP);
        }

    }

    @Override
    public void run() {
        if (currentHP < 5 || currentHP < 10) {
            currentTile = chanceController.luckIndex(arenaController.getRemainingTiles());
        }

    }

    @Override
    public void findItems() {

    }

    @Override
    public void rest() {

    }

    @Override
    public void eat() {

    }

    @Override
    public boolean isAlive() {
        //Wake up the participants
        if (!isAlive) {
            equip(getCurrentWeapon());
            setDistrict();
            name();
            return isAlive = true;
        } else {
            return false;
             }
    }

    @Override
    public String name() {
        setGender();
        if (gender == 0) {
            return randomNameGenerator.getFemaleName();
        } else if (gender == 1) {
            return randomNameGenerator.getMaleName();
        } else {
            return null;
        }
    }

    @Override
    public void equip(Weapons weapon) {
        this.weapon = itemController.returnFightItem();
            //itemController.returnFightItem();
        //System.out.println(itemController.returnFightItem());
        }

    public Weapons getCurrentWeapon() {
        return weapon;
    }
}

