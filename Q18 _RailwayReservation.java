class RailwayReservation {
    int seats = 1;

    synchronized void bookTicket(String name) {
        if (seats > 0) {
            System.out.println(name + ": Ticket booked successfully");
            seats--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation obj = new RailwayReservation();

        Thread t1 = new Thread(() -> obj.bookTicket("User1"));
        Thread t2 = new Thread(() -> obj.bookTicket("User2"));

        t1.start();
        t2.start();
    }
}