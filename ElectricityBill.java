class ElectricityBill {
    int customerId;
    String consumerName;
    int unitsConsumed;
    double bill;
    ElectricityBill(int customerId, String consumerName, int unitsConsumed) {
        this.customerId = customerId;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
    void calculateBill() {
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 3;
        } else if (unitsConsumed <= 300) {
            bill = (100 * 3) + ((unitsConsumed - 100) * 5);
        } else {
            bill = (100 * 3) + (200 * 5) + ((unitsConsumed - 300) * 8);
        }
        if (bill > 3000) {
            bill = bill + (bill * 0.05);
        }
    }
    void displayBill() {
        System.out.println("Customer ID      : " + customerId);
        System.out.println("Consumer Name    : " + consumerName);
        System.out.println("Units Consumed   : " + unitsConsumed);
        System.out.printf("Final Bill Amount: $%.2f\n", bill);
    }
    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill(101, "Prashant Pandey", 450);

        e1.calculateBill();
        e1.displayBill();
    }
}