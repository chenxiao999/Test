package gyam;

public class FullReductionCharge extends Charge{
    private double FullMoney;
    private double ReductionMoney;

    public FullReductionCharge(String fullMoney, String reductionMoney) {
        this.FullMoney = Double.parseDouble(fullMoney);
        this.ReductionMoney = Double.parseDouble(reductionMoney);
    }

    @Override
    public double getLastCharge(double money) {
        double result = money;
        if (money >= FullMoney) {
            result = money - Math.floor(money / FullMoney) * ReductionMoney;
        }
        return result;
    }
}
