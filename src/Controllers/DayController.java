package Controllers;
import ParticipantAttributes.competingParticipant;
import Controllers.ArenaController;

public class DayController extends ArenaController {
    int day;
    boolean dayTime = true;

    public void dayCounter() {
        do {
            day++;
        } while (!dayTime);
        System.out.println("==============================================");
        System.out.println("Day " + day   + " Begins!");
        System.out.println("May the odds be ever in your favour");
        System.out.println("==============================================");
    }

    public void decideDayTime() {

        }


        }


