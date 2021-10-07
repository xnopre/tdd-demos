package xnopre;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PricerTest {

    Pricer pricer = new Pricer();

    @Test
    public void should_calculate_price_without_tax() {
        String price = pricer.calculate(3, 1.21, 0);
        assertThat(price).isEqualTo("3.63 €");
    }

    @Test
    public void should_calculate_price_with_tax() {
        String price = pricer.calculate(3, 1.21, 5);
        assertThat(price).isEqualTo("3.81 €");
    }

    @Test
    public void should_calculate_price_with_tax_20() {
        String price = pricer.calculate(3, 1.21, 20);
        assertThat(price).isEqualTo("4.36 €");
    }
}
