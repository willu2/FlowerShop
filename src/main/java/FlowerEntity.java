import java.util.Random;

public class FlowerEntity implements Comparable<FlowerEntity> {

    enum FlowerType {
        Amaryllis,
        Begonia,
        Crocus,
        Gardenia,
        Gladiolus,
        Magnolia,
        Lily,
        Rose,
        Statice,
        Sunflower,
        Jonquil;

        //public void setFlowerType(FlowerType type){flowerType = type;        }

        public static FlowerType getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    private FlowerType flowerType;
    private String itemStatus = "Active";
    private int distance;
    private int distToSchool;
    private Integer price;
    private boolean status;

    public FlowerEntity(FlowerType flowerType, int distance, Integer price, boolean status) {
        this.flowerType = flowerType;
        this.price = price;
        this.status = status;
    }

    public FlowerEntity() {
    }

    public int getDistToSchool() {
        return distToSchool;
    }


    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Rent [price=" + price + "]";
    }

    @Override
    public int compareTo(FlowerEntity o) {
        return 0;
    }
}
