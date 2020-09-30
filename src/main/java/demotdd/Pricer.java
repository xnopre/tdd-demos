package demotdd;

public class Pricer {
    public String calculate(int quantity, double unitPrice, double tax) {
        double totalPriceWithoutTax = quantity * unitPrice;
        int discountRate = getDiscountRate(totalPriceWithoutTax);
        totalPriceWithoutTax = applyDiscount(totalPriceWithoutTax, discountRate);
        double totalPriceWithTax = totalPriceWithoutTax * (1 + tax / 100.0);
        return round(totalPriceWithTax) + " €";
    }

    private double applyDiscount(double totalPriceWithoutTax, int discountRate) {
        return totalPriceWithoutTax * (1- discountRate /100.0);
    }

    private int getDiscountRate(double totalPriceWithoutTax) {
        int discountRate = 0;
        if (totalPriceWithoutTax > 5000) {
            discountRate = 5;
        } else if (totalPriceWithoutTax > 1000) {
            discountRate = 3;
        }
        return discountRate;
    }

    private double round(double totalPriceWithTax) {
        return ((int) (totalPriceWithTax * 100 + 0.5)) / 100.0;
    }
}
