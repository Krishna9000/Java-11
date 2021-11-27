package c08;

public class P008DemoShipment {
    public static void main(String[] args) {
        P008Shipment shipment1 = new P008Shipment(10, 20, 15, 10, 3.41);
        var shipment2 = new P008Shipment(2,3,4,0.76,1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of shipment is: "+vol);
        System.out.println("Weight of the shipment is: "+shipment1.weight);
        System.out.println("Shipping cost: $"+shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment 2 is "+vol);
        System.out.println("Weight of shipment 2 is "+shipment2.weight);
        System.out.println("Shipping cost: $"+shipment2.cost);
    }
}
