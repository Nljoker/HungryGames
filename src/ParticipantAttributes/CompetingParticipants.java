package ParticipantAttributes;
import Controllers.*;

public class CompetingParticipants extends Participants{
    //Give them some random levels


    //One thing that I didn't quite understand ... But I couldn't create another just Public. It had to be a class
    public CompetingParticipants() {
        attackLevel = chanceController.getStatisticDamage(10);
        defenceLevel = chanceController.getStatisticDamage(10);
        strengthLevel = chanceController.getStatisticDamage(10);
    }
}
