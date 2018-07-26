package Lesson5.HomeWorke.Task1AirlineTicket;

import java.time.LocalTime;

public class TicketRunner {

    public static void main(String[] args) {

        // simple ticket:
        Ticket ticket1 = new Ticket(25, new PassengerInfo("Sylvester", "Stallone", "SS456465RL"),
                new FlightInfo("sfj23","California","LA", LocalTime.of(12, 20), 25, 250));


        System.out.println(ticket1.getPrice()); //250

        Ticket ticket2 = new VipTicket(112, new PassengerInfo("Arnold", "Schwarzenegger", "FG456465WE") ,
                new FlightInfo("sfk45","California","LA", LocalTime.of(12, 20), 112, 550),
                new Baggage(30,2), new Meal("soup", 20, true));

        System.out.println(ticket2.getPrice());//550 + (30 * 2) + (20 + 10) = 640
    }
}


//250
//640
//
//Process finished with exit code 0