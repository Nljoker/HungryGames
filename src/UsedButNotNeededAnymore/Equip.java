package UsedButNotNeededAnymore;

import Controllers.itemController;
import Equipables.Weapons;
import ParticipantAttributes.Participants;

public class Equip {

    Controllers.itemController itemController = new itemController();

    public Equip(Participants aParticipant) {
        if (aParticipant.isBreathing()) {
            Weapons toEquipItem = itemController.returnFightItem();
        }
    }
}
