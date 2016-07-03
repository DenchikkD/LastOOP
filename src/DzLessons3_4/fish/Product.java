package DzLessons3_4.fish;

/**
 * Created by Denni on 24.05.2016.
 */
public class Product {
    protected String tipeProduct;
    private Integer price;
    private Integer code;
    private Integer weidth;
    private String date;
    private String country;

    public Product() {
    }

    public Product(String tipeProduct, Integer price, Integer code, Integer weidth, String country, String date) {
        this.tipeProduct = tipeProduct;
        this.price = price;
        this.code = code;
        this.weidth = weidth;
        this.country = country;
        this.date = date;
    }

    public void printPrice() {
        System.out.println("Price: " + price);
    }

    public void printStoragePeriod() {
        System.out.println("Storage period: " + date);
    }

    public void printBarAndPrice() {
        printPrice();
        System.out.println("Bar code: " + code);
    }

    @Override
    public String toString() {
        return "Product{" +
                "tipeProduct= '" + tipeProduct + '\'' +
                ", price= " + price +
                ", code= " + code +
                ", weidth= " + weidth +
                ", date= '" + date + '\'' +
                ", country= '" + country + '\'' +
                ' ';
    }
}
