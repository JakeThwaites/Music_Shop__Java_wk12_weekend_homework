package Sell;

public class SellCheaply implements ISell {

    @Override
    public double calculateMarkup(int instrumentPrice){
        return instrumentPrice * 1.1;
    }
}
