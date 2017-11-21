package be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior;

public class AlcoholicBehavior implements DrinkingBehavior {

    @Override
    public int getNumberOfDuvelsOrderedAtBlommeke(int weight) {
        return Math.round(weight / 10f);
    }
}
