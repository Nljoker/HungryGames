package ParticipantAttributes;
import Controllers.*;

public class CompetingParticipants extends Participants{
    //Give them some random levels


    //One thing that I didn't quite understand ... But I couldn't create another just Public. It had to be a class
    public CompetingParticipants() {
        attackLevel = chanceController.getStatisticDamage(10);
        defenceLevel = chanceController.getStatisticDamage(10);
        strengthLevel = chanceController.getStatisticDamage(10);


        //You can get an illegal exception since 0 doesn't work. Make sure to re-roll the dice and avoid a 0.
        if (defenceLevel == 0) {
            defenceLevel = chanceController.getStatisticDamage(10);
        }
        if (attackLevel == 0) {
            attackLevel = chanceController.getStatisticDamage(10);
        }
        if (strengthLevel == 0) {
            strengthLevel = chanceController.getStatisticDamage(10);
        }
    }
}
