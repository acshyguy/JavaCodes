package AssignmentsAndClassWorks;

public class Hotel {
    String[] hotelRooms;

    public Hotel(int number) {
        this.hotelRooms = new String[number];
    }

    public String[] getRooms() {
        return hotelRooms;
    }
}
