package Controllers;

import FightPackage.AndTheWinnerIs;
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
    //please keep this in mind when developing your code Hayven. <- Good job, only two people can be fighting at the same time.

    public void startTheAnnualHungryGames() {
        ParticipantCreator participantCreator = new ParticipantCreator();
        participantCreator.wakeUp();
        participantCreator.feAndMa();
        participantCreator.districtNumber();

        //Initialize the first count of the day
        int day = 0;

        while (participantCreator.all.size() != 1) {
            day += 1;
            System.out.println();
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Today is day number " + day);
            System.out.println("+++++++++++++++++++++++++");
            System.out.println();
            Collections.shuffle(participantCreator.all);
            for (Participants p : participantCreator.all) {
                p.moveAround();
                Participants fightP = participantCreator.area(p);
                if(fightP != null) {
                    new FightingTime(p, fightP);
                } else {
                    p.moveAround();
                }
            }

            participantCreator.deadContestant();
            if (participantCreator.all.size() == 1)
                break;
        }
        //System.out.println("\n" + day + " has ended. Sleepy time." + participantCreator.all.get(chanceController.luckIndex(5)).getName() + " can't sleep\n");
        new AndTheWinnerIs(participantCreator.all.get(0));
    }



}







