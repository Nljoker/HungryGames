package com.RaboAndCap.MayTheOddsBeEverInYourFavour;

import java.util.ArrayList;
import java.util.Random;

public class randomNameGenerator {
    String maleName;
    String femaleName;

    Random rand = new Random();

    public String getMaleName() {
    ArrayList<String> maleNames = new ArrayList<>(); // Create an ArrayList object
        maleNames.add("Bryan");
        maleNames.add("Peter");
        maleNames.add("Rick");
        maleNames.add("Morty");
        maleNames.add("John");
        maleNames.add("Robert");
        maleNames.add("Danny");
        maleNames.add("Chad");
        maleNames.add("Brad");
        maleNames.add("Kanye");
        maleNames.add("Malone");
        maleNames.add("Marshall");

        int n = rand.nextInt(maleNames.size());
        maleName = maleNames.get(n);
        return maleName;

    }

    public String getFemaleName() {
        ArrayList<String> femaleNames = new ArrayList<>(); // Create an ArrayList object
        femaleNames.add("Summer");
        femaleNames.add("May");
        femaleNames.add("Amita");
        femaleNames.add("Jessie");
        femaleNames.add("Winter");
        femaleNames.add("Chloe");
        femaleNames.add("Aida");
        femaleNames.add("Palm");
        femaleNames.add("Emma");
        femaleNames.add("Charlotte");
        femaleNames.add("Abigail");
        femaleNames.add("Bonnie");
        int n = rand.nextInt(femaleNames.size());
        femaleName = femaleNames.get(n);
        return femaleName;
    }

}
