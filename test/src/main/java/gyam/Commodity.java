package gyam;

public abstract class Commodity {
    private String Name = "";
    private double price = 0d;
    private double discount = 1d;

    public Commodity(String name, double price, double discount) {
        this.Name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
