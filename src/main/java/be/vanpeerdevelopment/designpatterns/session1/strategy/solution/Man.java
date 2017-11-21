package be.vanpeerdevelopment.designpatterns.session1.strategy.solution;

import be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior.OverAverageDrinkingBehavior;

public class Man extends Person {

    public Man(String name, int weight) {
        super(name, weight, new OverAverageDrinkingBehavior());
    }
}
