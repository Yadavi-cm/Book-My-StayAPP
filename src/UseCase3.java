import java.util.HashMap;

/**
 * Use Case 3: Centralized Room Inventory Management
 *
 * Demonstrates usage of HashMap for storing
 * room availability in a centralized system.
 *
 * @author Student
 * @version 3.0
 */

class RoomInventory {

    private HashMap<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();

        rooms.put("Single Room", 10);
        rooms.put("Double Room", 5);
        rooms.put("Deluxe Room", 3);
    }

    public void displayRooms() {
        System.out.println("Room Availability:");

        for (String type : rooms.keySet()) {
            System.out.println(type + " -> " + rooms.get(type));
        }
    }

    public void updateRoom(String type, int count) {
        if (rooms.containsKey(type)) {
            rooms.put(type, count);
        } else {
            System.out.println("Invalid room type");
        }
    }

    public int getAvailability(String type) {
        return rooms.getOrDefault(type, 0);
    }
}

public class UseCase3 {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App v3.0 =====");

        RoomInventory inventory = new RoomInventory();

        inventory.displayRooms();

        System.out.println("\nUpdating Deluxe Room...");

        inventory.updateRoom("Deluxe Room", 2);

        inventory.displayRooms();

        System.out.println("\nAvailable Single Rooms: "
                + inventory.getAvailability("Single Room"));
    }
}