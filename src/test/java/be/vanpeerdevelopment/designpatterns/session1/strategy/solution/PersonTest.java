package be.vanpeerdevelopment.designpatterns.session1.strategy.solution;

import be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior.AlcoholicBehavior;
import be.vanpeerdevelopment.designpatterns.session1.strategy.solution.behavior.SoberBehavior;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void getNumberOfDuvelsOrderedAtBlommeke() {
        Person lightMan = new Man("Jos", 70);
        assertThat(lightMan.getNumberOfDuvelsOrderedAtBlommeke()).isEqualTo(3);

        Person heavyMan = new Man("Jef", 100);
        assertThat(heavyMan.getNumberOfDuvelsOrderedAtBlommeke()).isEqualTo(4);

        Person lightWoman = new Woman("Jozefien", 60);
        assertThat(lightWoman.getNumberOfDuvelsOrderedAtBlommeke()).isEqualTo(2);

        Person heavyWoman = new Woman("Margriet", 90);
        assertThat(heavyWoman.getNumberOfDuvelsOrderedAtBlommeke()).isEqualTo(3);

        Person matthias = new Man("Matthias", 99);
        matthias.setDrinkingBehavior(new AlcoholicBehavior());
        assertThat(matthias.getNumberOfDuvelsOrderedAtBlommeke()).isEqualTo(10);

        Person dieterDayAfterHangover = new Man("Dieter", 70);
        dieterDayAfterHangover.setDrinkingBehavior(new SoberBehavior());
        assertThat(dieterDayAfterHangover.getNumberOfDuvelsOrderedAtBlommeke()).isEqualTo(0);
    }
}