package ParticipantAttributes;

import Interfaces.Participant;
import Other.randomNameGenerator;

abstract class femaleParticipant extends ParticipantAttributes implements Participant {
    randomNameGenerator names = new randomNameGenerator();

    //Set the attributes the female participant has

    @Override
    public void fight() {

    }

    @Override
    public void heal() {

    }

    @Override
    public void run() {

    }

    @Override
    public void findItems() {

    }


    @Override
    public void rest() {

    }

}
