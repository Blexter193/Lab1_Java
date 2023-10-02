package Task5;

import java.util.Scanner;

import static java.lang.System.err;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Book", 0.5, 15);
        Item item2 = new Item("Frame", 0.25, 20);

        ReceivePoint receivePoint1 = new ReceivePoint("Zelena, 156, st.");
        DeparturePoint departurePoint = new DeparturePoint("Stepana Bandery, 12, st.");

        Shipment shipment1 = new Shipment("Truck", 1000, 100);

        shipment1.addItem(item1);
        shipment1.addItem(item2);

        Customer customer1 = new Customer("Oleksiy", "Zelena, 156, st.");

        if (shipment1.addItem(item1)) {
            System.out.println("Parcel 1 has been added to the shipment.");
        } else {
            System.out.println("Cannot add Parcel 1 to the shipment.");
        }

        if (shipment1.addItem(item2)) {
            System.out.println("Parcel 2 has been added to the shipment.");
        } else {
            System.out.println("Cannot add Parcel 2 to the shipment.");
        }

        if (shipment1.getDestination().equals(departurePoint.getAddress())) {
            departurePoint.sendShipment(shipment1);
            System.out.println("Відправлення доставлено відділенням.");
        } else {
            Courier courier = new Courier();
            courier.deliverToDestination(shipment1, shipment1.getDestination());
            System.out.println("Посилка доставлена велокур'єром.");
        }
    }

}