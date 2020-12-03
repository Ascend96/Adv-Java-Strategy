package discount;

public class TenPercentDiscount implements Strategy {
    @Override
    public double calculateDiscount(double bill) {
        return bill - (bill * .1);
    }
}
