package Controllers;
import Controllers.chanceController;
import ParticipantAttributes.competingParticipant;
import Controllers.DayController;

public  class ArenaController {
    //The arenasurface stands for the tiles in the entire game
    //a contestant can be assigned any random number between 0 and 50 to stand on.
    //if their tile is equal to their opponents tile. They start fighting. luck generator will run
    //as long as it can until it finds someone. However, if it doesn't find a person in the first 3 tries,
    //the arena will get smaller. This could cause an issue, that too many people are on the same tile and will most likely crash the code
    //please keep this in mind when developing your code Hayven.

    int numberOfTiles;
    int remainingTiles;

    public int getRemainingTiles() {
        remainingTiles = getNumberOfTiles() - 5;
        return remainingTiles;
    }

    public int getNumberOfTiles() {
        numberOfTiles = 50;
        return numberOfTiles;
    }

}







