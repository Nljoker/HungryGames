package Controllers;

import FightPackage.FightingTime;
import FightPackage.FindAFight;
import ParticipantAttributes.Participants;

import java.util.Collections;

public  class ArenaController {
    //The arenasurface stands for the tiles in the entire game
    //a contestant can be assigned any random number between 0 and 50 to stand on.
    //if their tile is equal to their opponents tile. They start fighting. luck generator will run
    //as long as it can until it finds someone. However, if it doesn't find a person in the first 3 tries,
    //the arena will get smaller. This could cause an issue, that too many people are on the same tile and will most likely crash the code
    //please keep this in mind when developing your code Hayven.

    public void startTheAnualHungryGames() {
        ParticipantCreator participantCreator = new ParticipantCreator();
        participantCreator.wakeUp();
        participantCreator.feAndMa();
        participantCreator.districtNumber();
        participantCreator.feAndMa();

        //Initialize the first count of the day
        int day = 1;

        while (participantCreator.all.size() != 1) {
            day += 1;
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Today is day number " + day);
            System.out.println("+++++++++++++++++++++++++");
            Collections.shuffle(participantCreator.all);
            for (Participants p : participantCreator.all) {
                p.moveAround();
                Participants fightP = participantCreator.area(p);
                if(fightP != null) {
                    new FightingTime(p, fightP);
                }
            }
        }
    }

}







