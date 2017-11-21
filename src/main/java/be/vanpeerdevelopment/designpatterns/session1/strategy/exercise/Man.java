package be.vanpeerdevelopment.designpatterns.session1.strategy.exercise;

public class Man extends Person {

    public Man(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int getNumberOfDuvelsOrderedAtBlommeke() {
        return getWeight() < 75 ? 3 : 4;
    }
}
