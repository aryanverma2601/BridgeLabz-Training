import java.util.*;

abstract class Person {
    protected String name;
    protected String passportNumber;

    public Person(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public abstract String getDetails();
}

class Passenger extends Person {
    public Passenger(String name, String passportNumber) {
        super(name, passportNumber);
    }
    @Override
    public String getDetails() {
        return "Passenger Name: " +name+ ", Passport: "+passportNumber;
    }
    public String getName() { 
        return name; 
    }
    public String getPassportNumber() { 
        return passportNumber; 
    }
}

class Flight{
    int id;
    String source;
    String destination;
    int seats;
    public Flight(int id,String source,String destination,int seats){
        this.id=id;
        this.source=source;
        this.destination=destination;
        this.seats=seats;
    }
}

class Booking{
    String user;
    Flight flight;

    public Booking(String user,Flight flight){
        this.user=user;
        this.flight = flight;
    }
}


public class FlightBookingSystem{
    static Scanner sc=new Scanner(System.in);
    static Flight[] flights={
        new Flight(1,"Delhi","Mumbai",3),
        new Flight(2,"Delhi","Chennai",2),
        new Flight(3,"Mumbai","Bangalore",1)
    };
    static ArrayList<Booking> bookings=new ArrayList<>();

    public static void main(String[] args){
        String name = sc.nextLine();
        String passport = sc.nextLine();
        Passenger p = new Passenger(name, passport);
        while(true){
            System.out.println("1.Search 2.Book 3.ViewBookings 4.Exit");
            int ch=sc.nextInt();

            if(ch == 1){
                String src = sc.next();
                String dest = sc.next();
                for(Flight f:flights){
                    if(f.source.equalsIgnoreCase(src)&&f.destination.equalsIgnoreCase(dest)){
                        System.out.println(f.id+" Seats:"+f.seats);
                    }
                }
            }
            else if(ch == 2){
                int flightId = sc.nextInt();
                for(Flight f:flights){
                    if(f.id==flightId){
                        if(f.seats>0){
                            bookings.add(new Booking(p.getName(),f));
                            f.seats--;
                            System.out.println("Booking Successful");
                        }
                        else{
                            System.out.println("No Seats Available");
                        }
                    }
                }

            }
            else if(ch == 3){
                for(Booking b:bookings){
                    if(b.user.equalsIgnoreCase(p.getName())){
                        System.out.println("Flight ID: "+b.flight.id+" From: "+b.flight.source+" To: "+b.flight.destination);
                    }
                }

            }
            else{
                break;
            }

        }

    }
}

