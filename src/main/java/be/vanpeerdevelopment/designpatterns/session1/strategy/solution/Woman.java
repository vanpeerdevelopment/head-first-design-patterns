package be.vanpeerdevelopment.designpatterns.session1.strategy.solution;

import be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior.AverageDrinkingBehavior;

public class Woman extends Person {

    public Woman(String name, int weight) {
        super(name, weight, new AverageDrinkingBehavior());
    }
}
