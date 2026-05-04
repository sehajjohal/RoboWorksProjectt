class Drone {
    String name;
    double range;
    int batteryLife;

    // Constructor with validation
    public Drone(String name, double range, int batteryLife) {
        this.name = name;
        this.range = range;

        if (batteryLife < 0) {
            this.batteryLife = 0;
        } else {
            this.batteryLife = batteryLife;
        }
    }

    // Overloaded constructor (quick build)
    public Drone(String name) {
        this(name, 10.0, 100);
    }

    // Recharge method (FIXED)
    public void recharge(int amount) {
        if (amount > 0) {
            batteryLife += amount;
            if (batteryLife > 100) {
                batteryLife = 100;
            }
        }
    }

    // Display method
    public void displayInfo() {
        System.out.println("Drone Name: " + name);
        System.out.println("Range: " + range + " km");
        System.out.println("Battery Life: " + batteryLife + "%");
        System.out.println("------------------------");
    }
}