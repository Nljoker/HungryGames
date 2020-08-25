package Controllers;

import Equipables.Weapons;
import Food.*;

import java.util.ArrayList;

public class FoodController {
    public ArrayList<Food> foodManager = new ArrayList<>(); // Create an ArrayList object
    public ArrayList<Food> eatDaFood = new ArrayList<>(); // Create an ArrayList object


    public void foodController() {
        foodManager.add(new MantaRay());

        for(Food food : foodManager) {
            if (food != null) {
                eatDaFood.add(food);
            }
        }
    }

    public Food getFood() {
        return eatDaFood.get(chanceController.luckIndex(eatDaFood.size()));
    }

}
