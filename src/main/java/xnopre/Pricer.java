package xnopre;

public class Pricer {
    public String caclculate(int quantity, double unitPrice, int tax) {
        double rawPrice = quantity * unitPrice;
        double priceWithTax = rawPrice * (1 + tax / 100.0);
        return round(priceWithTax) + " €";
    }


    private double round(double priceWithTax) {
        return ((int) (priceWithTax * 100 + 0.5)) / 100.0;
    }
}
