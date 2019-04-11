package flower.vbn.com;

import java.util.Random;

public class FlowerpotItem implements Comparable<FlowerpotItem> {

    //flowerpot types
    enum FlowerpotName {
        Flowerpot_1,
        Flowerpot_2,
        Flowerpot_3,
        Flowerpot_4,
        Flowerpot_5,
        Flowerpot_6;

        public static FlowerpotName getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    public FlowerpotName getFlowerpotName() {
        return flowerpotName;
    }

    private FlowerpotName flowerpotName;
    private Integer price;

    public FlowerpotItem(FlowerpotName flowerpotName, Integer price) {
        this.flowerpotName = flowerpotName;
        this.price = price;
    }

    public FlowerpotItem() {
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vazone [price=" + price + "]";
    }

    public int compareTo(FlowerpotItem o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}