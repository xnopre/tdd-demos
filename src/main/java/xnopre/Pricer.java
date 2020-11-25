package xnopre;

public class Pricer {
    public String calculate(int quantity, double unitPrice, int tax) {
        double rawPrice = quantity * unitPrice;
        double rawPriceWithDiscount = applyDiscount(rawPrice);
        double priceWithTax = applyTax(tax, rawPriceWithDiscount);
        return round(priceWithTax) + " €";
    }

    private double applyTax(int tax, double rawPriceWithDiscount) {
        return rawPriceWithDiscount * (1 + tax / 100.0);
    }

    private double applyDiscount(double rawPrice) {
        int discountRate = getDiscountRate(rawPrice);
        double rawPriceWithDiscount = rawPrice * (1 - discountRate / 100.0);
        return rawPriceWithDiscount;
    }

    private int getDiscountRate(double rawPrice) {
        int discountRate = 0;
        if (rawPrice >= 5000) {
            discountRate = 5;
        } else if (rawPrice >= 1000) {
            discountRate = 3;
        }
        return discountRate;
    }

    private double round(double priceWithTax) {
        return ((int) (priceWithTax * 100 + 0.5)) / 100.0;
    }
}
