package be.vanpeerdevelopment.designpatterns.session1.strategy.exercise;

public abstract class Person {

    private String name;
    private int weight;

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumberOfDuvelsOrderedAtBlommeke() {
        return weight < 75 ? 2 : 3;
    }
}
