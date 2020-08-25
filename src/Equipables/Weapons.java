package Equipables;

import ParticipantAttributes.Participants;

public abstract class Weapons {
     int damageBonus = 0;
     int speed = 0;
     int defence = 0;
     boolean twoHanded;

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefence() {
        return defence;
    }

    public void equip(Participants participants) {
        if (participants.getWeapon() == null) {
            participants.setWeapon(this);
        }
    }
    }







