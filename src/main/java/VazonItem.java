import java.util.Random;

public class VazonItem  {

    enum VazonName {
        Vazon_1,
        Vazon_2,
        Vazon_3,
        Vazon_4,
        Vazon_5,
        Vazon_6;

        public static VazonItem.VazonName getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    public VazonName getVazonName() {
        return vazonName;
    }

    private VazonItem.VazonName vazonName;
    private Integer price;

    public VazonItem(VazonItem.VazonName vazonName, Integer price) {
        this.vazonName = vazonName;
        this.price = price;
    }

    public VazonItem() {
    }

    public void setVazonName(VazonItem.VazonName vazonName) {
        this.vazonName = vazonName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vazone [price=" + price + "]";
    }

    public int compareTo(VazonItem o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}