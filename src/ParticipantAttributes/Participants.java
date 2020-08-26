package ParticipantAttributes;

import Equipables.*;
import Controllers.*;
import Other.*;

public abstract class Participants {


    //Here we set the attributes
    String name;
    public int gender;
    int district;
    int maxHP = 99;
    int currentHP = maxHP;
    int attackLevel;
    int strengthLevel;
    int defenceLevel;
    Weapons weapon = null;
    public int currentTile = 0;
    boolean isBreathing = true;

    public void moveAround() {
        if (isBreathing) {
            currentTile = chanceController.luckIndex(25);
            sleep();
        }
    }

    public void Fight(Participants opponent) {
        if (currentHP > 0) {
            //I'm probably messing up the naming conventions here ... SORRY. But this is the only way I could figure out how to set levels. See previous tries
            int setAttackLevel;
            int setStrengthLevel;
            int setDefencelevel;

            //Here we check the current weapon. Did they get one assigned, then levels are set. This entire game is based on luck
            //And because I like using the chanceController - Edit deleted the chancecontroller from calculation here because
            //it was giving me minus damage on HP which added it to the HP. Caused to get stuck in a loop and try to get the randomized chance every time
            if (weapon != null) {
                setAttackLevel = (attackLevel + weapon.getSpeed());
                setStrengthLevel = (strengthLevel + weapon.getDamageBonus());
                setDefencelevel = (defenceLevel + weapon.getDefence());
                //Make sure levels are set, even though the contestants should always receive a weapon
            } else {
                setAttackLevel = attackLevel;
                setDefencelevel = defenceLevel;
                setStrengthLevel = strengthLevel;
            }
            //Googled fun ways to make numbers even more random
            int damageOnHP = ((Math.max(1, setAttackLevel) + setStrengthLevel) + setDefencelevel) - chanceController.getStatisticDamage(15);
            //randomize the afflicted damage to include a critical attack
            int randomizedChance = chanceController.luckIndex(99);
            if (randomizedChance < 2/* && setStrengthLevel > 50 || randomizedChance < 4 && setDefencelevel < 8*/) {
                opponent.currentHP = 0;
                System.out.println(name + "Wow, looks like a critical hit! " + opponent.name + " has lost his life. GL in new simulation :)");
            } else if (randomizedChance >= 98 /*&& setAttackLevel < 5*/) {
                opponent.currentHP = 0;
                System.out.println("What happened there? " + name + " totally missed " + opponent.name + " but " + opponent.name + " slipped and broke vital bones");
            }  else {
                opponent.currentHP -= damageOnHP;
                //System.out.println(opponent.currentHP);
                //Comment this out. Check if damage is actually being done.
                //System.out.println(name + " hits a whopping " + damageOnHP + " on " + opponent.name);
            }
        }


    }
    //When a day passes, participants get to sleep. When you sleep, you can rest ... but ... Some people die from having taken too much damage
    public void sleep() {
        if (currentHP < 3) {
            currentHP = 0;
            System.out.println("Sadly " + name + " has taken too much damage.");
        } else {
            currentHP = maxHP;
        }
    }

    public void setName() {
        randomNameGenerator randomNameGenerator = new randomNameGenerator();
        if (gender == 0) {
            this.name = randomNameGenerator.getFemaleName();
        } else if (gender == 1) {
            this.name = randomNameGenerator.getMaleName();
        } else
            this.name = "Please man, you're code is broken";
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setGender() {
        gender = chanceController.luckIndex(2);
        //System.out.println(gender);
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setWeapon(Weapons currentWeapon) {
        this.weapon = currentWeapon;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void isCurrentlyBreathing(boolean isBreathing) {
        this.isBreathing = isBreathing;
    }

    public boolean isBreathing() {
        return isBreathing;
    }
}
