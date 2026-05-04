class DeliveryBot {
    String name;
    int capacity;
    String status;

    public DeliveryBot(String name, int capacity, String status) {
        this.name = name;
        this.capacity = capacity;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("Bot Name: " + name);
        System.out.println("Capacity: " + capacity + " kg");
        System.out.println("Status: " + status);
        System.out.println("------------------------");
    }
}