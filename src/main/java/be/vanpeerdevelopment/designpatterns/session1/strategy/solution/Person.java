package be.vanpeerdevelopment.designpatterns.session1.strategy.solution;

import be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior.DrinkingBehavior;

public abstract class Person {

    private String name;
    private int weight;
    private DrinkingBehavior drinkingBehavior;

    public Person(String name, int weight, DrinkingBehavior drinkingBehavior) {
        this.name = name;
        this.weight = weight;
        this.drinkingBehavior = drinkingBehavior;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setDrinkingBehavior(DrinkingBehavior drinkingBehavior) {
        this.drinkingBehavior = drinkingBehavior;
    }

    public int getNumberOfDuvelsOrderedAtBlommeke() {
        return drinkingBehavior.getNumberOfDuvelsOrderedAtBlommeke(weight);
    }
}
