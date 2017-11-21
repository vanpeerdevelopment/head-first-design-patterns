package be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior;

public class OverAverageDrinkingBehavior implements DrinkingBehavior {

    @Override
    public int getNumberOfDuvelsOrderedAtBlommeke(int weight) {
        return weight < 75 ? 3 : 4;
    }
}
