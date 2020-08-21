package ParticipantAttributes;

import Equipables.Weapons;
import Interfaces.Participant;
import Controllers.itemController;
import Other.randomNameGenerator;

public abstract class maleParticipant extends ParticipantAttributes implements Participant {
    randomNameGenerator names = new randomNameGenerator();
    itemController item = new itemController();



    @Override
    public void fight() {

        }




    @Override
    public void heal() {
        if (currentHP < 15 | currentHP < 30 | currentHP < 45) {
            eat();
        }

    }

    @Override
    public void run() {
        if (currentHP < 15) {

        }

    }

    @Override
    public void findItems() {
    }


    @Override
    public void rest() {

    }

    @Override
    public void eat() {
        findItems();


    }

    @Override
    public void equip(Weapons weapons) {
        System.out.println(weapons);

    }


}
