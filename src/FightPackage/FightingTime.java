package FightPackage;

//Really, my naming conventions. I've made so many classes. This should be fight

import ParticipantAttributes.*;

public class FightingTime {
    //You don't really want one to be able to run away. But there's a chance ...
    public FightingTime(Participants one, Participants two) {
        while(one.isBreathing() && two.isBreathing()) {
            one.Fight(two);
            two.Fight(one);
            if (one.getCurrentHP() <= 0) {
                System.out.println(one.getName() + " has lost his life to" + two.getName());
                one.isCurrentlyBreathing(false);
                System.out.println("=================" + one.getName().toUpperCase() + "DEAD" + "=================");
            } else if(two.getCurrentHP() <= 0) {
                System.out.println(two.getName() + " has lost his life to" + one.getName());
                two.isCurrentlyBreathing(false);
                System.out.println("=================" + two.getName().toUpperCase() + "DEAD" + "=================");
            } else {
                System.out.println("Something went wrong, please try again");
                System.out.println("Also, check your FightingTime Class");
            }
        }

    }
}