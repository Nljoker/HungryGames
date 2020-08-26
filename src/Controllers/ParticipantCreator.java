package Controllers;

import Equipables.*;
import ParticipantAttributes.*;
import FightPackage.*;
import UsedButNotNeededAnymore.Participant;
import com.sun.nio.file.ExtendedWatchEventModifier;

import java.util.ArrayList;
import java.util.Arrays;

public class ParticipantCreator {
    itemController itemController = new itemController();
    ArrayList<Participants> males = new ArrayList<>();
    ArrayList<Participants> females = new ArrayList<>();
    ArrayList<Participants> all = new ArrayList<>();

    public void wakeUp() {
        for (int i = 0; i < 12; i++) {
            Participants participants = new CompetingParticipants();
            Weapons fightItem = itemController.returnFightItem();
            participants.setGender();
            fightItem.equip(participants);
            if (participants.gender == 1) {
                males.add(participants);
            } else if (participants.gender == 0){
                females.add(participants);
            } else {
                System.out.println("Check your wakeup() method");
            }

        }

    }

    public void districtNumber() {
        //Male district number
        int districtNumberM = 1;
        for (Participants participants : males) {
            participants.setDistrict(districtNumberM);
            districtNumberM += 1;
        }
        //Female district number
        int districtNumberF = 1;
        for (Participants participants : females) {
            participants.setDistrict(districtNumberF);
            districtNumberF += 1;
        }
    }
    //put both in one list
    public void feAndMa() {
        all.addAll(males);
        all.addAll(females);
        for (Participants p : all) {
            p.setName();
        }
        //String f = Arrays.toString(all.toArray());
        //System.out.println(Arrays.toString(all.toArray()));

    }

    public Participants area(Participants players) {
        Participants sameTile = null;
        for (Participants p : all) {
            if (players.currentTile == p.currentTile && players != p) {
                sameTile = p;
            }
        }
        return sameTile;
    }

    public void deadContestant() {
        //So, I had to research how to remove one from an Arraylist.
        //But I have no idea why this works. What is a Predicate? I indicated p in this case to be "Player"
        //as set in the area example above. This SHOULD remove all the dead peeps from the all list.
            all.removeIf(p -> !p.isBreathing());
    }
}
