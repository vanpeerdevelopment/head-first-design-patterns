package be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior;

public class SoberBehavior implements DrinkingBehavior {

    @Override
    public int getNumberOfDuvelsOrderedAtBlommeke(int weight) {
        return 0;
    }
}
