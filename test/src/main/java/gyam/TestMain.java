package gyam;

import org.junit.Test;

public class TestMain {
    /**
     * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
     * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
     * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    @Test
    public void test1() throws Exception {
        Commodity apple = CommodityFactory.CreateCommodity("苹果");
        Commodity strawberry = CommodityFactory.CreateCommodity("草莓");

        ChargeContext chargeContext = new ChargeContext("正常消费");
        double result = chargeContext.getResult(apple.getPrice()* apple.getDiscount()*10 + strawberry.getPrice()* strawberry.getDiscount()*9);
        if (result <= 0) {
            throw new Exception("总价为负数！");
        }
        System.out.println("顾客A所购买商品的总价:"+result+"元。");
    }

    /**
     * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
     * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    @Test
    public void test2() throws Exception {
        Commodity apple = CommodityFactory.CreateCommodity("苹果");
        Commodity strawberry = CommodityFactory.CreateCommodity("草莓");
        Commodity mango = CommodityFactory.CreateCommodity("芒果");

        ChargeContext chargeContext = new ChargeContext("正常消费");
        double result = chargeContext.getResult(apple.getPrice()*10 + strawberry.getPrice()*9 + mango.getPrice()*1);
        result = -1;
        if (result <= 0) {
            throw new Exception("总价为负数！");
        }
        System.out.println("顾客B所购买商品的总价:"+result+"元。");
    }

    /**
     * 3、超市做促销活动，草莓限时打 8 折。
     * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    @Test
    public void test3() throws Exception {
        Commodity apple = CommodityFactory.CreateCommodity("苹果");
        Commodity strawberry = CommodityFactory.CreateCommodity("草莓");
        Commodity mango = CommodityFactory.CreateCommodity("芒果");
        //苹果打8折
        apple.setDiscount(0.8);
        ChargeContext chargeContext = new ChargeContext("正常消费");
        double result = chargeContext.getResult(apple.getPrice()* apple.getDiscount()*10 + strawberry.getPrice()* strawberry.getDiscount()*9 + mango.getPrice()* mango.getDiscount()*1);
        if (result <= 0) {
            throw new Exception("总价为负数！");
        }
        System.out.println("顾客C所购买商品的总价:"+result+"元。");
    }

    /**
     *4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
     * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     */
    @Test
    public void test4() throws Exception {
        Commodity apple = CommodityFactory.CreateCommodity("苹果");
        Commodity strawberry = CommodityFactory.CreateCommodity("草莓");
        Commodity mango = CommodityFactory.CreateCommodity("芒果");
        ChargeContext chargeContext = new ChargeContext("满100减10块");
        double result = 0d;
        result = chargeContext.getResult(apple.getPrice()* apple.getDiscount()*10 + strawberry.getPrice()* strawberry.getDiscount()*9 + mango.getPrice()* mango.getDiscount()*1);
        if (result <= 0) {
            throw new Exception("总价为负数！");
        }
        System.out.println("顾客D所购买商品的总价:"+result+"元。");
    }
}
