package Sell;

public class SellExpensively implements ISell{

    @Override
    public double calculateMarkup(int instrumentPrice) {
        return instrumentPrice * 1.2;
    }
}
