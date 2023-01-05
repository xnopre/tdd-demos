package xnopre;

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

    @Test
    public void should_calculate_price_with_discount_over_1000() {
        String price = pricer.calculate(5, 345, 10);
        assertThat(price).isEqualTo("1840.58 €");
    }

    @Test
    public void should_calculate_price_with_discount_over_5000() {
        String price = pricer.calculate(5, 1299, 10);
        assertThat(price).isEqualTo("6787.28 €");
    }
}
