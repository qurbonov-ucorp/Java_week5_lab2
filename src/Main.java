public class Main {
    public static void main(String[] args) {
        Flight myFlight = new Flight("UA254", "San Francisco", "12A", "G18");
        System.out.println(myFlight);
    }
}

class BoardingPass {
    private String seatNumber;
    private String gate;

    public BoardingPass(String seatNumber, String gate) {
        this.seatNumber = seatNumber;
        this.gate = gate;
    }

    @Override
    public String toString() {
        return "Seat: " + seatNumber + ", Gate: " + gate;
    }
}

class Flight {
    private String flightID;
    private String destination;
    private BoardingPass boardingPass;

    public Flight(String flightID, String destination, String seat, String gate) {
        this.flightID = flightID;
        this.destination = destination;
        this.boardingPass = new BoardingPass(seat, gate);
    }

    @Override
    public String toString() {
        return "Flight ID: " + flightID +
                "\nDestination: " + destination +
                "\n" + boardingPass.toString();
    }
}