package be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior;

public class AverageDrinkingBehavior implements DrinkingBehavior {

    @Override
    public int getNumberOfDuvelsOrderedAtBlommeke(int weight) {
        return weight < 75 ? 2 : 3;
    }
}
