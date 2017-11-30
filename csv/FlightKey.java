package csv;

public class FlightKey {

    private String arrival;
    private String departure;
    private String flightDate;

    public FlightKey(String arrival, String departure, String flightDate) {
        this.arrival = arrival;
        this.departure = departure;
        this.flightDate = flightDate;
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;

        FlightKey obj1 = (FlightKey) obj;
        if(obj1.arrival.equals(arrival) && obj1.departure.equals(departure) && obj1.flightDate.equals(flightDate))
        {
            return true;
        }
        return flag;
    }
}
