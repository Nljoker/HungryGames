package UsedButNotNeededAnymore;

import java.util.Random;

public class Team {
    //HP stands for HITPOINTS
    int HP = 99;
    int fightingHP;
    int maxHP = HP;
    int strength;
    int agility;
    int accuracy;
    int afflictedDamage;


    //initialize the random number generator
    Random rand = new Random();
    //set the random generators for the different attributes
    int lowInt = rand.nextInt(9);
    int medInt = rand.nextInt(49);
    int highInt = rand.nextInt(99);

    public void eat(int foodPoints) {
        HP = HP + foodPoints;

    }




    //create the male contestor
    public void maleContestor() {
        maxHP = HP;
        strength = highInt;
        agility = lowInt;
        accuracy = medInt;

        //The afflicted damage will take down the hitpoints from the contestants from the other team. Hopefully, to eliminate the other person.
        //Killing is not allowed since that's illegal. Since it's a game, every time the run button is hit, the NPC's will respawn.
        afflictedDamage = (strength / (agility + 5)) + accuracy;
        //This just means that the dude is extremely buffed, but not really agile. Should follow some scrum tutorials.
        if (strength > 80 && agility <= 2) {
            afflictedDamage = 99;
            System.out.println("CRITICAL HIT! WHAT A MONSTER");
        }
        System.out.println(strength + " Is the strength level");
        System.out.println(agility + " Is the agility level");
        System.out.println(accuracy + " Is the accuracy level");
        System.out.println(afflictedDamage);



    }

    //create the female contestor
    public void femaleContestor() {
        maxHP = HP;
        strength = lowInt;
        agility = medInt;
        accuracy = highInt;

        afflictedDamage = (strength / (agility + 3)) + accuracy;
        if (strength < 8 && agility > 45 || strength <= 2 && accuracy >= 80) {
            afflictedDamage = 99;
            System.out.println("Wow! What a great hit! So accurate. Straight outta here");
        }
        System.out.println(strength + " Is the strength level");
        System.out.println(agility + " Is the agility level");
        System.out.println(accuracy + " Is the accuracy level");
        System.out.println(afflictedDamage);

    }

}
