public class RoboWorksApp {
    public static void main(String[] args) {

        // Normal objects
        Drone d1 = new Drone("Runner", 15.5, 80);
        Drone d2 = new Drone("Airby"); // overloaded constructor

        DeliveryBot b1 = new DeliveryBot("CarryBot", 50, "Available");
        DeliveryBot b2 = new DeliveryBot("SpeedBot"); // overloaded constructor

        // Test recharge
        d1.recharge(30);

        // Display all info
        d1.displayInfo();
        d2.displayInfo();

        b1.displayInfo();
        b2.displayInfo();
    }
}