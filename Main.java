class RoboWorksApp {
    public static void main(String[] args) {

        Drone d1 = new Drone("Runner", 16, 120);
        Drone d2 = new Drone("Airby", 25, 150);

        DeliveryBot b1 = new DeliveryBot("CarryBot", 50, "Available");
        DeliveryBot b2 = new DeliveryBot("SpeedBot", 30, "Delivering");

        d1.displayInfo();
        d2.displayInfo();

        b1.displayInfo();
        b2.displayInfo();
    }
}