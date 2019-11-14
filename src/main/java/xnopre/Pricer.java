package xnopre;

public class Pricer {
    public String calculate(int quantity, double unitPrice, int tax) {
        double rawPrice = quantity * unitPrice;
        int discountRate = getDiscountRate(rawPrice);
        rawPrice *= (1- discountRate /100.0);
        double priceWithTax = rawPrice * (1 + tax / 100.0);
        double totalPrice = round(priceWithTax);
        return totalPrice + " €";
    }

    private int getDiscountRate(double rawPrice) {
        int discountRate = 0;
        if (rawPrice > 5000) {
             discountRate = 5;
        } else if (rawPrice > 1000) {
             discountRate = 3;
        }
        return discountRate;
    }

    private double round(double priceWithTax) {
        return ((int) (priceWithTax * 100 + 0.5)) / 100.0;
    }
}
