import java.util.HashMap;

/**
 * Use Case 4: Room Search & Availability Check
 *
 * Demonstrates read-only search on inventory.
 * Only available rooms are displayed.
 *
 * @author Student
 * @version 4.0
 */


// Search Service (READ ONLY)
class SearchService {

    public void searchAvailableRooms(RoomInventory inventory,
                                     HashMap<String, Room> roomDetails) {

        System.out.println("Available Rooms:");

        for (String type : inventory.getInventory().keySet()) {

            int available = inventory.getInventory().get(type);

            // Show only available rooms
            if (available > 0) {

                Room room = roomDetails.get(type);

                System.out.println("\n" + type + " (Available: " + available + ")");
                room.displayRoomDetails();   // IMPORTANT: your method name
            }
        }
    }
}

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App v4.0 =====");

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Room details (USE YOUR EXISTING CLASSES)
        HashMap<String, Room> roomDetails = new HashMap<>();

        roomDetails.put("Single Room", new SingleRoom());
        roomDetails.put("Double Room", new DoubleRoom());
        roomDetails.put("Deluxe Room", new SuiteRoom());

        // Search
        SearchService search = new SearchService();
        search.searchAvailableRooms(inventory, roomDetails);
    }
}