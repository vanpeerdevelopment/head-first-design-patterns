package be.vanpeerdevelopment.designpatterns.session1.strategy.exerxcise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyTest {

    @Test
    public void test() {
        Strategy strategy = new Strategy();

        String actual = strategy.test();

        assertThat(actual).isEqualTo("test");
    }
}