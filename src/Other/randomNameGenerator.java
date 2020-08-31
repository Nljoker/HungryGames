package Other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class randomNameGenerator {
    String maleName;
    String femaleName;

    Random rand = new Random();


    public String getMaleName() {
    ArrayList<String> maleNames = new ArrayList<>(); // Create an ArrayList object
        maleNames.add("Bryan[M]");
        maleNames.add("Peter[M]");
        maleNames.add("Rick[M]");
        maleNames.add("Morty[M]");
        maleNames.add("John[M]");
        maleNames.add("Robert[M]");
        maleNames.add("Danny[M]");
        maleNames.add("Chad[M]");
        maleNames.add("Brad[M]");
        maleNames.add("Kanye[M]");
        maleNames.add("Malone[M]");
        maleNames.add("Marshall[M]");
        maleNames.add("Roman[M]");
        maleNames.add("Nico[M]");
        maleNames.add("Tom[M]");
        maleNames.add("Clyde[M]");
        //Tried to add a distinct getter, didn't work.
        int n = rand.nextInt(maleNames.size());
        maleName = maleNames.get(n);
        return maleName;

    }

    public String getFemaleName() {
        ArrayList<String> femaleNames = new ArrayList<>(); // Create an ArrayList object
        femaleNames.add("Summer[F]");
        femaleNames.add("May[F]");
        femaleNames.add("Amita[F]");
        femaleNames.add("Jessie[F]");
        femaleNames.add("Winter[F]");
        femaleNames.add("Chloe[F]");
        femaleNames.add("Aida[F]");
        femaleNames.add("Palm[F]");
        femaleNames.add("Emma[F]");
        femaleNames.add("Charlotte[F]");
        femaleNames.add("Abigail[F]");
        femaleNames.add("Marjorie[F]");
        femaleNames.add("Beach[F]");
        femaleNames.add("Anna[F]");
        femaleNames.add("Tanita[F]");
        femaleNames.add("Granny[F]");
        int n = rand.nextInt(femaleNames.size());
        femaleName = femaleNames.get(n);
        return femaleName;
    }

}
