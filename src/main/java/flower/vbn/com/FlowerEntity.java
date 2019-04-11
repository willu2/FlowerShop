package flower.vbn.com;

import java.util.Random;

public class FlowerEntity implements Comparable<FlowerEntity> {


    enum FlowerName {
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

        public static FlowerName getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    private FlowerName flowerName;
    private Integer price;
    private boolean status;

    public FlowerEntity(FlowerName flowerName, Integer price) {
        this.flowerName = flowerName;
        this.price = price;
        this.status = status;
    }

    public FlowerEntity() {
    }

    public FlowerName getVazonName() {
        return flowerName;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower [price=" + price + "]";
    }

    @Override
    public int compareTo(FlowerEntity o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}