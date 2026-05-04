class Drone {
    String name;
    double range;
    int batteryLife;

    public Drone(String name, double range, int batteryLife) {
        this.name = name;
        this.range = range;
        this.batteryLife = batteryLife;
    }

    public void displayInfo() {
        System.out.println("Drone Name: " + name);
        System.out.println("Range: " + range + " km");
        System.out.println("Battery Life: " + batteryLife + " mins");
        System.out.println("------------------------");
    }
}