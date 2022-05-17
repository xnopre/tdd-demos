package xnopre;

public class Pricer {
    public String calculatePrice(int quantity, double unitPrice, int tax) {
        double priceWithoutTax = quantity * unitPrice;
        double priceWithTax = priceWithoutTax * (1 + tax / 100.0);
        return round(priceWithTax) + " €";
    }

    private double round(double priceWithTax) {
        return ((int) (priceWithTax * 100 + 0.5)) / 100.0;
    }
}
