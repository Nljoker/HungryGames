package UsedButNotNeededAnymore;

import Equipables.Weapons;

public interface Participant {
    void fight();
    void heal();
    void run();
    void findItems();
    void rest();
    void eat();

    boolean isAlive();
    String name();

    void equip(Weapons weapons);
}
