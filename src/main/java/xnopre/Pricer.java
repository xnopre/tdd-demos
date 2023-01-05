package xnopre;

public class Pricer {
    public String calculate(int quantity, double unitPrice, int tax) {
        double rawPrice = quantity * unitPrice;
        rawPrice = applyDiscount(rawPrice);
        double priceWithTax = rawPrice * (1 + tax / 100.0);
        return round(priceWithTax) + " €";
    }

    private static double applyDiscount(double rawPrice) {
        int discountRate = getDiscountRate(rawPrice);
        rawPrice *= 1 - discountRate / 100.0;
        return rawPrice;
    }

    private static int getDiscountRate(double rawPrice) {
        int discountRate = 0;
        if (rawPrice > 5000) {
            discountRate = 5;
        } else if (rawPrice > 1000) {
            discountRate = 3;
        }
        return discountRate;
    }

    private static double round(double priceWithTax) {
        return ((int) (priceWithTax * 100 + 0.5)) / 100.0;
    }
}
