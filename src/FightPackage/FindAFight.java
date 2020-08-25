package FightPackage;

import ParticipantAttributes.Participants;

public class FindAFight {

    public FindAFight(Participants one, Participants two) {
        if (one.isBreathing()) {
            if (two.isBreathing()) {
                System.out.println(one.getName() + " walks into " + two.getName());
                System.out.println("Let's fight!");
            } if (one.getDistrict() == two.getDistrict() && one.getCurrentHP() > 90 && two.getCurrentHP() < 30 ||
                two.getDistrict() == one.getDistrict() && two.getCurrentHP() > 90 && one.getCurrentHP() < 30) {
                System.out.println("Oh no, one became malicious! A fight is inevitable");
                System.out.println("Let's see how this same district fight pans out");
            } else {
                new FightingTime(one, two);
            }
        }
    }
}
