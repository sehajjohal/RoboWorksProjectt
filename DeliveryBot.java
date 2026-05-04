class DeliveryBot {
    String name;
    int capacity;
    String status;

    // Main constructor (WITH validation)
    public DeliveryBot(String name, int capacity, String status) {
        this.name = name;
        this.capacity = capacity;

        if (status.equals("Available") || status.equals("Delivering")) {
            this.status = status;
        } else {
            this.status = "Unknown";
        }
    }

    // Overloaded constructor
    public DeliveryBot(String name) {
        this(name, 20, "Available"); // default values
    }

    public void displayInfo() {
        System.out.println("Bot Name: " + name);
        System.out.println("Capacity: " + capacity + " kg");
        System.out.println("Status: " + status);
        System.out.println("------------------------");
    }
}