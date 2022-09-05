package gyam;

public class DiscountCharge extends Charge{
    private double discount = 1d;

    public DiscountCharge(String discount){
        this.discount = Double.parseDouble(discount);
    }

    @Override
    public double getLastCharge(double money) {

        double result = money * discount;
        return result;
    }
}
