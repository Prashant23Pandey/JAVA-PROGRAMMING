class MovieTicket {
    String movieName;
    String seatType;
    int numberOfTickets;
    double ticketPrice;
    MovieTicket(String movieName, String seatType, int numberOfTickets, double ticketPrice) {
        this.movieName = movieName;
        this.seatType = seatType;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }
    void calculateBill() {
        double totalAmount = numberOfTickets * ticketPrice;
        double discount = 0;
        if (numberOfTickets > 10) {
            discount = totalAmount * 0.20;
        } else if (numberOfTickets > 5) {
            discount = totalAmount * 0.10; 
        }

        double finalAmount = totalAmount - discount;
        System.out.println("----- Booking Summary -----");
        System.out.println("Movie Name          : " + movieName);
        System.out.println("Seat Type           : " + seatType);
        System.out.println("Number of Tickets   : " + numberOfTickets);
        System.out.println("Ticket Price        : " + ticketPrice);
        System.out.println("Total Amount        : " + totalAmount);
        System.out.println("Discount Amount     : " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", "Gold", 8, 250);

        ticket.calculateBill();
    }
}