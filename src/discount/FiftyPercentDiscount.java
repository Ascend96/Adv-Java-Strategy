package discount;

public class FiftyPercentDiscount implements Strategy {
    @Override
    public double calculateDiscount(double bill) {
        return bill - (bill * .5);
    }
}
