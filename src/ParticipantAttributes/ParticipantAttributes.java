package ParticipantAttributes;

import Equipables.*;
import Interfaces.*;
import Other.*;
import Controllers.*;

import java.util.ArrayList;
import java.util.spi.AbstractResourceBundleProvider;

public class ParticipantAttributes {

    int strengthLevel;
    int defenceLevel;
    int attackLevel;
    int district;
    int HP = 99;
    int currentHP = HP;
    //0 = female | 1 = male
    int gender;
    int MaleOrFemale = gender;
    boolean isAlive = false;
    int currentTile;
    ArenaController arenaController = new ArenaController();

    public void setDistrict() {
        ArrayList<Integer> distinctDistrict = new ArrayList<Integer>();
        for (int i = 1; i <= 12; i++) {
            distinctDistrict.add(i);
        } district = distinctDistrict.get(chanceController.luckIndex(distinctDistrict.size()));
        System.out.println(district);
    }

    public int getDistrict() {
        return district;
    }


    public void setGender() {
        this.gender = chanceController.luckIndex(2);
    }

    public void setLevels() {
            strengthLevel = MaleOrFemale + chanceController.getStatisticDamage(30);
            defenceLevel = MaleOrFemale + chanceController.getStatisticDamage(30);
            attackLevel = MaleOrFemale + chanceController.getStatisticDamage(30);
        }

        public void setCurrentTile() {
        currentTile = chanceController.luckIndex(arenaController.getRemainingTiles());
        }


    }










