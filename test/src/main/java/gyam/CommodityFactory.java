package gyam;

public class CommodityFactory {
    public static Commodity CreateCommodity(String type){
        Commodity commodity = null;
        switch (type){
            case "苹果":
                commodity = new Apple("苹果",8,1);
                break;
            case "草莓":
                commodity = new Strawberry("草莓",13,1);
                break;
            case "芒果":
                commodity = new Mango("芒果",20,1);
                break;
        }
        return commodity;
    }
}
