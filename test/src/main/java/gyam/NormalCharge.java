package gyam;

public class NormalCharge extends Charge{
    @Override
    public double getLastCharge(double money) {
        return money;
    }
}
