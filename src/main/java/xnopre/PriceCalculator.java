package xnopre;

public class PriceCalculator {
    public String calculate(int quantity, double unitPrice, int tax) {
        double totalPrice = quantity * unitPrice;
        double totalPriceWithTax = totalPrice * (1 + tax / 100.0);
        int discountRate = getDiscountRate(totalPriceWithTax);
        double totalPriceWithTaxAndSicount = totalPriceWithTax * (1- discountRate /100.0);
        return round(totalPriceWithTaxAndSicount) + " €";
    }

    private int getDiscountRate(double totalPriceWithTax) {
        int discountRate = 0;
        if(totalPriceWithTax > 5000) {
            discountRate = 5;
        } else if (totalPriceWithTax > 1000) {
            discountRate = 3;
        }
        return discountRate;
    }

    private double round(double totalPriceWithTax) {
        return ((int)((totalPriceWithTax * 100.0 + 0.5)))/100.0;
    }
}
