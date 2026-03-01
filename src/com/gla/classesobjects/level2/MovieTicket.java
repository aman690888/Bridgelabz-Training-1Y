public class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    void bookTicket(int seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        ticket.movieName = "Avengers";
        ticket.bookTicket(12, 250);

        ticket.displayDetails();
    }
}