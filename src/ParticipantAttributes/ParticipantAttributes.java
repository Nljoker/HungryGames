package ParticipantAttributes;

import Interfaces.Participant;
import com.RaboAndCap.MayTheOddsBeEverInYourFavour.randomNameGenerator;
import Controllers.chanceController;

import java.util.ArrayList;
import java.util.Collections;

public abstract class ParticipantAttributes {

    int strengthLevel;
    int defenceLevel;
    int attackLevel;
    int district;
    //0 = female | 1 = male
    int gender;

    public void setDistrict() {
        ArrayList<Integer> distinctDistrict = new ArrayList<Integer>();
        for (int i = 1; i <= 12; i++) {
            distinctDistrict.add(i);
            Collections.shuffle(distinctDistrict);
        } district = distinctDistrict.get(chanceController.luckIndex(distinctDistrict.size()));
    }

    public int getDistrict() {
        return district;
    }


    void setGender() {
        gender = chanceController.luckIndex(2);
    }

    public void setLevels (int MaleOrFemale) {
            strengthLevel = MaleOrFemale + chanceController.getStatisticDamage(30);
            defenceLevel = MaleOrFemale + chanceController.getStatisticDamage(30);
            attackLevel = MaleOrFemale + chanceController.getStatisticDamage(30);
        }

    public int getStrengthLevel() {
        return strengthLevel;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public int getGender() {
        return gender;
    }

    }



//
//    public void setGender() {
//        if (n)
//    }










