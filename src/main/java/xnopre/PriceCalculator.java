package xnopre;

public class PriceCalculator {
    public String calculatePrice(int quantity, double unitPrice, int tax) {
        double totalPriceWithoutTax = quantity * unitPrice;
        double totalPrice = totalPriceWithoutTax * (1 + tax / 100.0);
        double totalPriceRounded = round(totalPrice);
        return totalPriceRounded +" €";
    }

    private double round(double totalPrice) {
        return ((int) ((totalPrice * 100)+0.5)) / 100.0;
    }
}
