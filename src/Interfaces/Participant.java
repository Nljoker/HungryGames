package Interfaces;

import Equipables.Weapons;

public interface Participant {
    void fight();
    void heal();
    void run();
    void findItems();
    void equip();
    void rest();
    void eat();

    void equip(Weapons weapon);



}
