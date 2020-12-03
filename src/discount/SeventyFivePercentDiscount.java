package discount;

public class SeventyFivePercentDiscount implements Strategy {
    @Override
    public double calculateDiscount(double bill) {
        return bill - (bill *.75);
    }
}
