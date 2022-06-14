package tdd;

import AssignmentsAndClassWorks.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    Hotel hotel;

    @BeforeEach
    void setUp() {
        hotel = new Hotel(65);
    }

    @Test
    void testThatArrayIsCreated() {
        assertEquals(5,hotel.getRooms().length);
    }
}