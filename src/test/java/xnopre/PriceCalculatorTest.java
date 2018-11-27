package xnopre;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceCalculatorTest {

    @Test
    public void should_calculate_price_without_tax() {
        PriceCalculator priceCalculator = new PriceCalculator();
        String price = priceCalculator.calculate(3, 1.21, 0);
        assertThat(price).isEqualTo("3.63 €");
    }

    @Test
    public void should_calculate_price_with_tax() {
        PriceCalculator priceCalculator = new PriceCalculator();
        String price = priceCalculator.calculate(3, 1.21, 5);
        assertThat(price).isEqualTo("3.81 €");
    }

    @Test
    public void should_calculate_price_with_tax_20() {
        PriceCalculator priceCalculator = new PriceCalculator();
        String price = priceCalculator.calculate(3, 1.21, 20);
        assertThat(price).isEqualTo("4.36 €");
    }

    @Test
    public void should_calculate_price_with_discount_1000() {
        PriceCalculator priceCalculator = new PriceCalculator();
        String price = priceCalculator.calculate(5, 345.00, 10);
        assertThat(price).isEqualTo("1840.58 €");
    }

    @Test
    public void should_calculate_price_with_discount_5000() {
        PriceCalculator priceCalculator = new PriceCalculator();
        String price = priceCalculator.calculate(5, 1299.00, 10);
        assertThat(price).isEqualTo("6787.28 €");
    }
}
