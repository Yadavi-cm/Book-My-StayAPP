import java.util.LinkedList;
import java.util.Queue;

/**
 * Use Case 5: Booking Request Queue (FIFO)
 *
 * Demonstrates fair request handling using Queue.
 * No inventory update is done here.
 *
 * @author Student
 * @version 5.0
 */

// Reservation (Booking Request)
class Reservation {

    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}

// Booking Request Queue
class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    // Add request to queue
    public void addRequest(String guestName, String roomType) {
        Reservation request = new Reservation(guestName, roomType);
        queue.add(request);

        System.out.println("Request Added: " + guestName + " -> " + roomType);
    }

    // Display all queued requests (FIFO order)
    public void displayRequests() {
        System.out.println("\nBooking Requests in Queue:");

        for (Reservation r : queue) {
            System.out.println(r.getGuestName() + " -> " + r.getRoomType());
        }
    }
}

public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App v5.0 =====");

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Simulating guest requests
        bookingQueue.addRequest("Alice", "Single Room");
        bookingQueue.addRequest("Bob", "Deluxe Room");
        bookingQueue.addRequest("Charlie", "Single Room");

        // Display queue
        bookingQueue.displayRequests();
    }
}