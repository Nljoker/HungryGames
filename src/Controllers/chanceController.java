package Controllers;

import java.util.Random;

public class chanceController {

    public static int getStatisticDamage(int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber);
    }

    //Why do I have to use static here?
    public static int luckIndex(int luckNumber) {
        Random random = new Random();
        return random.nextInt(luckNumber);
    }





//    public int lowChance = rand.nextInt(9);
//    public int medLowChance = rand.nextInt(29);
//    public int medChance = rand.nextInt(49);
//    public int medHighChance = rand.nextInt(79);
//    public int highChance = rand.nextInt(99);



}
