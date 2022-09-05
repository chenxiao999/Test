package gyam;

public class ChargeContext {
    Charge charge = null;
    public ChargeContext(String type){
        switch (type){
            case "正常消费":
                charge = new NormalCharge();
                break;
            case "满100减10块":
                charge = new FullReductionCharge("100","10");
                break;
        }
    }

    public double getResult(double money){
        return charge.getLastCharge(money);
    }
}
