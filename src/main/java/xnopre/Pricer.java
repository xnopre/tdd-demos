package xnopre;

public class Pricer {
    public String calculate(int quantity, double unitPrice, int tax) {
        double priceWithoutTax = quantity * unitPrice;
        int discountRate = getDiscountRate(priceWithoutTax);
        priceWithoutTax *= (1- discountRate /100.0);
        double priceWithTax = priceWithoutTax * (1 + tax / 100.0);
        return round(priceWithTax) + " €";
    }

    private int getDiscountRate(double priceWithoutTax) {
        int discountRate = 0;
        if (priceWithoutTax > 5000) {
            discountRate = 5;
        } else if (priceWithoutTax > 1000) {
            discountRate = 3;
        }
        return discountRate;
    }

    private double round(double priceWithTax) {
        return ((int) (priceWithTax * 100 + 0.5)) / 100.0;
    }
}
