package Task5;

public class Shipment {
    private final Item[] items;
    private final String deliveryMethod;
    private final double maxWeight;
    private final double maxSize;

    public Shipment(String deliveryMethod, double maxWeight, double maxSize) {
        this.deliveryMethod = deliveryMethod;
        this.maxWeight = maxWeight;
        this.maxSize = maxSize;
        this.items = new Item[100];
    }

    public boolean addItem(Item item) {
        return false;
    }

    public void cancelShipment() {
    }

    public Object getDestination() {
        return null;
    }
}