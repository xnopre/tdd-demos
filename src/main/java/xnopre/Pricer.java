package xnopre;

public class Pricer {
    public String calculate(int quantity, double unitPrice, int tax) {
        double priceWithoutTax = quantity * unitPrice;
        priceWithoutTax = applyDiscount(priceWithoutTax);
        double priceWithTax = applyTax(tax, priceWithoutTax);
        return round(priceWithTax) +" €";
    }

    private double applyTax(int tax, double priceWithoutTax) {
        return priceWithoutTax * (1 + tax / 100.0);
    }

    private double applyDiscount(double priceWithoutTax) {
        int discountRate = getDiscountRate(priceWithoutTax);
        priceWithoutTax = priceWithoutTax * (1- discountRate /100.0);
        return priceWithoutTax;
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
        return ((int) (priceWithTax * 100.0 + 0.5)) / 100.0;
    }
}
