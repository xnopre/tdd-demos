package xnopre;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceCalculatorTest {

    @Test
    public void should_calculate_price_without_tax() {
        // 1. Préparation
        PriceCalculator priceCalculator = new PriceCalculator();

        // 2. Test / Action
        String price = priceCalculator.calculatePrice(3, 1.21, 0);

        // 3. Vérification(s)
        assertThat(price).isEqualTo("3.63 €");
    }

    @Test
    public void should_calculate_price_with_tax() {
        PriceCalculator priceCalculator = new PriceCalculator();

        String price = priceCalculator.calculatePrice(3, 1.21, 5);

        assertThat(price).isEqualTo("3.81 €");
    }

    @Test
    public void should_calculate_price_with_tax_2() {
        PriceCalculator priceCalculator = new PriceCalculator();

        String price = priceCalculator.calculatePrice(3, 1.21, 20);

        assertThat(price).isEqualTo("4.36 €");
    }
}
